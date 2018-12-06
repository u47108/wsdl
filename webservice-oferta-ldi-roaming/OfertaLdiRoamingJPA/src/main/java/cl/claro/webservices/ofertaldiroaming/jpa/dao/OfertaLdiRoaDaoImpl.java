/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.claro.webservices.ofertaldiroaming.jpa.dao;

import cl.claro.webservices.ofertaldiroaming.jpa.util.HibernateUtil;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author luisnunez
 */
public class OfertaLdiRoaDaoImpl {

    private static final Logger logger = Logger.getLogger(OfertaLdiRoaDaoImpl.class);

    public List consultaOfertaLdiRoaming(String tipoProducto, String tipoBolsa, int firtRow, int pageSize) {
        List result = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Query uniqueQuery = session.getNamedQuery("GET_LDIROA_BY_PRECIO")
                    .setString("P_TY_PROD", tipoProducto)
                    .setString("P_TY_BOLSA", tipoBolsa)
                    .setInteger("P_FIRST_ROW", firtRow)
                    .setInteger("P_LAST_ROW", pageSize);
            result = uniqueQuery.list();
            
        } catch (RuntimeException e) {

            logger.error("Error en consultaOfertaLdiRoaming");
        } finally {
            if ( session.isOpen()) {
                session.close();
            }
        }
        return result;
    }

    public Long contConsultaOfertaLdiRoaming(String tipoProducto, String tipoBolsa) {
        Long totalRows = 0l;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Query uniqueQuery = session.getNamedQuery("COUNT_GET_LDIROA_BY_PRECIO")
                    .setString("P_TY_PROD", tipoProducto)
                    .setString("P_TY_BOLSA", tipoBolsa);
            totalRows = (Long) uniqueQuery.list().get(0);
        } catch (RuntimeException e) {

            logger.error("RuntimeException : error en contConsultaOfertaLdiRoaming");
        } finally {
            if (session.isOpen()) {
                session.close();
            }
        }
        return totalRows;
    }
    
    public List consultaOfertaLdiRoamingByOfferId(String tipoProducto, String tipoBolsa, int firtRow, int pageSize,String offerid) {
        List result = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Query uniqueQuery = session.getNamedQuery("GET_OFFERID_BY_PRECIO")
                    .setString("P_OFFER", offerid)
                    .setString("P_TY_PROD", tipoProducto)
                    .setString("P_TY_BOLSA", tipoBolsa)
                    .setInteger("P_FIRST_ROW", firtRow)
                    .setInteger("P_LAST_ROW", pageSize);
            result = uniqueQuery.list();
        } catch (RuntimeException e) {

            logger.error("Error en consultaOfertaLdiRoamingByOfferId");
        } finally {
            if ( session.isOpen()) {
                session.close();
            }
        }
        return result;
    }

    public Long contConsultaOfertaLdiRoamingByOfferId(String tipoProducto, String tipoBolsa,String offerid) {
        Long totalRows = 0l;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            Query uniqueQuery = session.getNamedQuery("COUNT_GET_LDIROA_BY_OFFERPRECIO")
                    .setString("P_OFFER", offerid)
                    .setString("P_TY_PROD", tipoProducto)
                    .setString("P_TY_BOLSA", tipoBolsa);
            
            totalRows = (Long) uniqueQuery.list().get(0);
        } catch (RuntimeException e) {

            logger.error("RuntimeException : error en contConsultaOfertaLdiRoamingByOfferId");
        } finally {
            if (session.isOpen()) {
                session.close();
            }
        }
        return totalRows;
    }

}
