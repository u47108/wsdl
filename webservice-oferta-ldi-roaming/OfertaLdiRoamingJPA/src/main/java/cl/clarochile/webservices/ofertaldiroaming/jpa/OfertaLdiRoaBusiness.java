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
import cl.clarochile.webservices.ofertaldiroaming.jpa.mapping.OfertaBolsas;
import cl.clarochile.webservices.ofertaldiroaming.jpa.util.ConstantLdiRoa;
import cl.clarochile.webservices.ofertaldiroaming.jpa.util.HibernateUtil;
import cl.clarochile.webservices.ofertaldiroaming.jpa.util.Validaciones;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author luisnunez
 */
public class OfertaLdiRoaBusiness {

    private static int defaultPageSize = 5;
    private static final Logger logger = Logger.getLogger(OfertaLdiRoaBusiness.class);
    private static final Validaciones valid = new Validaciones();

    public ConsultaBolsasResponse listBolsasLdiRoaming(ConsultaBolsasRequest parameters) {
        int pageSize = 1;
        int page = 1;
        ConsultaBolsasResponse respuesta = null;
        PaginationTypeBolsas paginacionsalida = null;
        if (valid.validarPeticion(parameters)) {
            page = Integer.parseInt(parameters.getPagination().getPagenumber());
            pageSize = Integer.parseInt(parameters.getPagination().getLimitpage());
        }
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            Query uniqueQuery = session.getNamedQuery("GET_LDIROA_BY_PRECIO")
                    .setString("P_TY_PROD", parameters.getTipoProducto().value())
                    .setInteger("P_FIRST_ROW", page)
                    .setInteger("P_LAST_ROW", pageSize);
            List result = uniqueQuery.list();
            if (result != null && !result.isEmpty()) {

                respuesta = procesarRespuestaLdiRoaming(result);

            } else {
                respuesta = new ConsultaBolsasResponse();
                respuesta.setDescription(ConstantLdiRoa.NOT_FOUND);
                respuesta.setCode(ConstantLdiRoa.HTTP_NOT_FOUND);
            }
            //convertir EQUIPO
            //FIN CONVERTIR EQUIPO
        } catch (RuntimeException e) {

            logger.trace("RuntimeException : " + e.getMessage(), e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return respuesta;
    }

    private ConsultaBolsasResponse procesarRespuestaLdiRoaming(List<OfertaBolsas> result) {
        ConsultaBolsasResponse respuesta = new ConsultaBolsasResponse();
        List< BolsaType> bolsaDb = new ArrayList<>();

        if (result != null && result.isEmpty()) {
            result.forEach((of) -> {
                bolsaDb.add(convertBolsaDbOfertaComercial(of));
            });
        }
        List<Bolsa> resumenBolsas= new ArrayList<>();
    
                
        return respuesta;
    }

    private BolsaType convertBolsaDbOfertaComercial(OfertaBolsas of) {
        BolsaType bolsaNueva=new BolsaType();
        bolsaNueva.setDescripcion(of.getDescripcion());
        bolsaNueva.setDestacado(of.isDestacado());
        bolsaNueva.setDuracion(of.getDuracion());
        bolsaNueva.setDuracionUnidad(of.getDuracionUnidad());
        bolsaNueva.setEstado(of.isEstado());
        //bolsaNueva.setFechaIngreso(of.getFechaIngreso());
        //bolsaNueva.setFechaModificacion(of.getFechaModificacion());
        bolsaNueva.setOfferId(of.getOfferId());
        bolsaNueva.setOfferName(of.getOfferName());
        bolsaNueva.setRecurrente(of.getRecurrente());
        //bolsaNueva.setTipoBolsa(of.getTipoBolsa());
        //bolsaNueva.setTipoProducto(of.getTipoProducto());
        return bolsaNueva;
    }

}
