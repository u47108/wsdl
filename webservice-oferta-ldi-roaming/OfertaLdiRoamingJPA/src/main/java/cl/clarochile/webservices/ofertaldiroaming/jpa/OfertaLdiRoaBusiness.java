/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.clarochile.webservices.ofertaldiroaming.jpa;

import cl.clarochile.webservices.ofertabolsaswsdl.Bolsa;
import cl.clarochile.webservices.ofertabolsaswsdl.BolsaType;
import cl.clarochile.webservices.ofertabolsaswsdl.ConsultaBolsasRequest;
import cl.clarochile.webservices.ofertabolsaswsdl.ConsultaBolsasResponse;
import cl.clarochile.webservices.ofertabolsaswsdl.PaginationTypeBolsas;
import cl.clarochile.webservices.ofertaldiroaming.jpa.dao.OfertaLdiRoaDaoImpl;
import cl.clarochile.webservices.ofertaldiroaming.jpa.mapping.OfertaBolsas;
import cl.clarochile.webservices.ofertaldiroaming.jpa.util.ConstantLdiRoa;
import cl.clarochile.webservices.ofertaldiroaming.jpa.util.Validaciones;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisnunez
 */
public class OfertaLdiRoaBusiness {

    private final OfertaLdiRoaDaoImpl ofertaDao = new OfertaLdiRoaDaoImpl();
    private static final int defaultPageSize = 5;
    private static final Validaciones valid = new Validaciones();

    public ConsultaBolsasResponse listBolsasLdiRoaming(ConsultaBolsasRequest parameters) {
        int pageSize = 1;
        int numeroPaginaIn = 1;
        ConsultaBolsasResponse respuesta = null;
        PaginationTypeBolsas paginacionsalida = null;
        if (valid.validarPeticion(parameters)) {
            numeroPaginaIn = Integer.parseInt(parameters.getPagination().getPagenumber());
            pageSize = Integer.parseInt(parameters.getPagination().getLimitpage());

            if (parameters.getOfferId() != null && !parameters.getOfferId().isEmpty()) {
                List resultOfferId = null;
                Long filas = ofertaDao.contConsultaOfertaLdiRoamingByOfferId(parameters.getTipoProducto().value(), parameters.getTipoBolsa().value(), parameters.getOfferId());
                if (filas > 0) {
                    int tamanioPaginacion = (pageSize != 0 && pageSize > 0) ? pageSize : defaultPageSize;
                    int page = 0;
                    if (numeroPaginaIn > 0) {
                        page = numeroPaginaIn;
                    } else {
                        page = 1;
                    }
                    int firstRow = page == 1 ? 0 : (tamanioPaginacion * (page - 1));
                    int lastRow = (tamanioPaginacion * page);
                    resultOfferId = ofertaDao.consultaOfertaLdiRoamingByOfferId(parameters.getTipoProducto().value(), parameters.getTipoBolsa().value(), firstRow, lastRow, parameters.getOfferId());
                }

                if (resultOfferId != null && !resultOfferId.isEmpty()) {
                    paginacionsalida = calcularPaginacion(filas, pageSize, numeroPaginaIn);
                    respuesta = procesarRespuestaLdiRoaming(resultOfferId);
                    respuesta.setPagination(paginacionsalida);
                    respuesta.setDescription(ConstantLdiRoa.HTTP_OK);
                    respuesta.setCode(ConstantLdiRoa.HTTP_OK_MESG);

                }
            } else {
                List result = null;
                Long filas = ofertaDao.contConsultaOfertaLdiRoaming(parameters.getTipoProducto().value(), parameters.getTipoBolsa().value());
                if (filas > 0) {
                    int tamanioPaginacion = (pageSize != 0 && pageSize > 0) ? pageSize : defaultPageSize;
                    int page = 0;
                    if (numeroPaginaIn > 0) {
                        page = numeroPaginaIn;
                    } else {
                        page = 1;
                    }
                    int firstRow = page == 1 ? 0 : (tamanioPaginacion * (page - 1));
                    int lastRow = (tamanioPaginacion * page);
                     result = ofertaDao.consultaOfertaLdiRoaming(parameters.getTipoProducto().value(), parameters.getTipoBolsa().value(), firstRow, lastRow);
                }
               
                if (result != null && !result.isEmpty()) {

                    paginacionsalida = calcularPaginacion(filas, pageSize, numeroPaginaIn);
                    respuesta = procesarRespuestaLdiRoaming(result);
                    respuesta.setPagination(paginacionsalida);
                    respuesta.setDescription(ConstantLdiRoa.HTTP_OK);
                    respuesta.setCode(ConstantLdiRoa.HTTP_OK_MESG);
                    return respuesta;
                }
            }
            respuesta = new ConsultaBolsasResponse();
            respuesta.setDescription(ConstantLdiRoa.NOT_FOUND);
            respuesta.setCode(ConstantLdiRoa.HTTP_NOT_FOUND);
        } else {
            //error en parametros
            respuesta = new ConsultaBolsasResponse();
            respuesta.setDescription(ConstantLdiRoa.HTTP_PARAM);
            respuesta.setCode(ConstantLdiRoa.HTTP_PARAM_MGS);
        }

        //convertir EQUIPO
        //FIN CONVERTIR EQUIPO
        return respuesta;
    }

    private ConsultaBolsasResponse procesarRespuestaLdiRoaming(List<OfertaBolsas> result) {
        ConsultaBolsasResponse respuesta = new ConsultaBolsasResponse();
        List< BolsaType> bolsaDb = new ArrayList<>();

        if (result != null && !result.isEmpty()) {
            result.forEach((of) -> {
                bolsaDb.add(convertBolsaDbOfertaComercial(of));
            });
        }
        Bolsa listaBolsas = new Bolsa();
        listaBolsas.getBolsa().addAll(bolsaDb);
        respuesta.setBolsaType(listaBolsas);
        return respuesta;
    }

    private BolsaType convertBolsaDbOfertaComercial(OfertaBolsas of) {
        BolsaType bolsaNueva = new BolsaType();
        bolsaNueva.setDescripcion(of.getDescripcion());
        bolsaNueva.setDestacado(of.isDestacado());
        bolsaNueva.setDuracion(of.getDuracion());
        bolsaNueva.setDuracionUnidad(of.getDuracionUnidad());
        bolsaNueva.setEstado(of.isEstado());
        bolsaNueva.setFechaIngreso(Validaciones.getGregorianCalendar(of.getFechaIngreso()));
        bolsaNueva.setFechaModificacion(Validaciones.getGregorianCalendar(of.getFechaModificacion()));
        bolsaNueva.setOfferId(of.getOfferId());
        bolsaNueva.setOfferName(of.getOfferName());
        bolsaNueva.setRecurrente(of.getRecurrente());
        bolsaNueva.setTipoBolsa(of.getTipoBolsa());
        bolsaNueva.setTipoProducto(of.getTipoProducto());
        bolsaNueva.setPrecio(Validaciones.fmt(of.getPrecio()));
        return bolsaNueva;
    }

    private PaginationTypeBolsas calcularPaginacion(Long totalRows, int pageTotal, int pageNumber) {
        PaginationTypeBolsas pageResult = new PaginationTypeBolsas();

        if (totalRows > 0) {
            int pageSize = (pageTotal != 0 && pageTotal > 0) ? pageTotal : defaultPageSize;
            int page = 0;
            if (pageNumber > 0) {
                page = pageNumber;
            } else {
                page = 1;
            }
            int firstRow = page == 1 ? 0 : (pageSize * (page - 1));
            int lastRow = (pageSize * page);
            float totalRowsF = totalRows;
            float pages = pageSize;
            float resultPagesRows = totalRowsF / pages;
            resultPagesRows = (float) Math.ceil(resultPagesRows);
            long resultPages = (long) resultPagesRows;

            pageResult.setLimitpage(pageSize + "");
            pageResult.setPagenumber(page + "");
            pageResult.setTotalrow(String.valueOf(resultPages));
        }
        return pageResult;
    }

}
