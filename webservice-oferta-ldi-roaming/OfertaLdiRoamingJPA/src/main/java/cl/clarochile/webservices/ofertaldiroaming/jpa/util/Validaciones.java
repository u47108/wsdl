/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.clarochile.webservices.ofertaldiroaming.jpa.util;

import cl.clarochile.webservices.ofertabolsaswsdl.ConsultaBolsasRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public boolean validarPeticion(ConsultaBolsasRequest parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
