/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.clarochile.webservices.oferta.roaming.ldi.ws;

import cl.clarochile.webservices.ofertaldiroaming.jpa.mapping.Properties;
import cl.clarochile.webservices.ofertaldiroaming.jpa.util.HibernateUtil;
import java.io.ByteArrayInputStream;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.w3c.dom.Document;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author luisnunez
 */
public class InitServiceOfertaLdiRoaming implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
             DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            Properties prop = obtenerProperties("OfertaLdiRoaming", "WS_LIST_OfertaLdiRoaming", "xmlLogger");
            if (prop != null) {
                String stringXml = prop.getValorXml();
                ByteArrayInputStream in = new ByteArrayInputStream(stringXml.getBytes());
                Document doc = builder.parse(in);
                DOMConfigurator.configure(doc.getDocumentElement());
                Logger log = LogManager.getLogger(InitServiceOfertaLdiRoaming.class.getName());
                log.info("log4jFileName: " + stringXml);
            }
        } catch (Exception e) {
           
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    	//reemplaza el context
    }
    private Properties obtenerProperties(String nombreAplicacion, String nombreModulo, String llave) {
        Properties properties = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.getNamedQuery("sql_properties");
        query.setParameter("paramNombreAplicacion", nombreAplicacion);
        query.setParameter("paramNombreModulo", nombreModulo);
        query.setParameter("paramLlave", llave);
        properties = (Properties) query.uniqueResult();
        return properties;
    }
}
