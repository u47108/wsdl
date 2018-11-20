/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.clarochile.webservices.ofertaldiroaming.jpa.util;

import cl.clarochile.webservices.ofertabolsaswsdl.ConsultaBolsasRequest;
import cl.clarochile.webservices.ofertabolsaswsdl.PaginationTypeBolsas;
import cl.clarochile.webservices.ofertabolsaswsdl.TipoBolsaType;
import cl.clarochile.webservices.ofertabolsaswsdl.TipoProductoType;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author luisnunez
 */
public class Validaciones {

    public Validaciones() {
    }

    //validaciones
    public static boolean validDateSql(String fecha) {
        return Pattern.matches("\\d\\d\\d\\d/\\d\\d/\\d\\d", fecha);
    }

    public static boolean validDate(String fecha) {
        return Pattern.matches("\\d\\d/\\d\\d/\\d\\d\\d\\d", fecha);
    }

    public boolean length(String text, Integer max) {
        if (text.trim().length() > 0 && text.trim() != null) {
            return (text.trim().length() > max) ? false : true;
        } else {
            return false;
        }
    }

    public boolean alphanumeric(String cadena) {
        boolean r = false;
        try {
            String regex = "[^A-Za-z0-9_]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(cadena);
            r = (matcher.matches()) ? false : true;
        } catch (Exception e) {
            r = false;
        }
        return r;
    }

    public boolean length(String text, Integer min, Integer max) {
        if (text != null && text.trim().length() > 0 && text.trim() != null) {
            return (text.trim().length() <= max && text.trim().length() >= min) ? true : false;
        } else {
            return false;
        }
    }

    public static boolean validateLength(String text, Integer min, Integer max) {
        if (text != null && text.trim().length() > 0 && text.trim() != null) {
            return (text.trim().length() <= max && text.trim().length() >= min) ? true : false;
        } else {
            return false;
        }
    }

    public boolean required(String text) {
        if (text != null) {
            return (text.trim().length() > 0) ? true : false;
        }
        return false;
    }

    public boolean isNumber(String text) {
        try {
            if (text != null) {
                if (text.length() > 0) {
                    for (int i = 0; i < text.length(); i++) {
                        if (!Character.isDigit(text.charAt(i))) {
                            return false;
                        }
                    }
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static boolean esNumero(String s) {
        try {
            if (s != null) {
                if (s.length() > 0) {
                    for (int i = 0; i < s.length(); i++) {
                        if (!Character.isDigit(s.charAt(i))) {
                            return false;
                        }
                    }
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    /**
     * validarPeticion retorna true o false si cumple con la validacion
     *
     * @param parameters
     * @return
     */
    public boolean validarPeticion(ConsultaBolsasRequest parameters) {
        boolean resultValidar = false;
        if (parameters != null
                && TipoBolsaType.valueOf(parameters.getTipoBolsa().value()) != null
                && TipoProductoType.valueOf(parameters.getTipoProducto().value()) != null
                && parameters.getPagination() != null) {
            TipoBolsaType enumBolsa = parameters.getTipoBolsa();
            TipoProductoType enumProd = parameters.getTipoProducto();
            boolean busquedaLdi = false;
            boolean busquedaRoa = false;
            boolean busquedaOne = false;
            boolean busquedaSiap = false;
            boolean busquedaDth = false;
            boolean busquedaHfc = false;
            boolean busquedaVtv = false;
            switch (enumBolsa) {
                case LDI:
                    busquedaLdi = true;
                    break;
                case ROAMING:
                    busquedaRoa = true;
                    break;
            }

            switch (enumProd) {
                case ONE:
                    busquedaOne = true;
                    break;
                case SIAP:
                    busquedaSiap = true;
                    break;
                case DTH:
                    busquedaDth = true;
                    break;
                case HFC:
                    busquedaHfc = true;
                    break;
                case VTV:
                    busquedaVtv = true;
                    break;
            }

            if ((busquedaLdi || busquedaRoa) && (busquedaOne || busquedaSiap || busquedaDth || busquedaHfc || busquedaVtv)) {
                if (!(parameters.getOfferId() != null && !parameters.getOfferId().isEmpty())) {
                    resultValidar = validacionPaginacion(parameters.getPagination());
                } else {
                    if (esNumero(parameters.getOfferId())) {
                        return true;
                    }

                }

            }

        }
        return resultValidar;
    }

    public static XMLGregorianCalendar getGregorianCalendar(Date date) {
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        } catch (Exception e) {

        }
        return null;
    }

    public boolean validacionPaginacion(PaginationTypeBolsas pagination) {
        //validar paginacion
        if (pagination.getLimitpage() != null && esNumero(pagination.getLimitpage())
                && pagination.getPagenumber() != null && esNumero(pagination.getPagenumber())
                && pagination.getTotalrow() != null && esNumero(pagination.getTotalrow())) {
            return true;
        } else {
            return false;
        }
    }

    public static String fmt(double d) {
        if (d == (long) d) {
            return String.format("%d", (long) d);
        } else {
            return String.format("%s", d);
        }
    }
}
