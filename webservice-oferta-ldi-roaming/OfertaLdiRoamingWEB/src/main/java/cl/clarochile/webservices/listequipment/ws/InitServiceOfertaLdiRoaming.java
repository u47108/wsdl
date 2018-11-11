/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.clarochile.webservices.listequipment.ws;

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
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.xml.sax.SAXException;

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
            
            Properties prop = obtenerProperties("OfertaLdiRoaming", "WS_LIST_OfertaLdiRoaming", "log4jFileName");
            if (prop != null) {
                String stringXml = prop.getValorXml();
                ByteArrayInputStream in = new ByteArrayInputStream(stringXml.getBytes());
                Document doc = builder.parse(in);
                DOMConfigurator.configure(doc.getDocumentElement());
                Logger log = LogManager.getLogger(InitServiceOfertaLdiRoaming.class.getName());
                log.info("log4jFileName: " + stringXml);
                log.info("*** Aplicacion OfertaLdiRoaming Desplegada***");
            }
        } catch (ParserConfigurationException e) {
           
        } catch (SAXException e) {
            
        } catch (IOException e) {
            
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
    private Properties obtenerProperties(String nombreAplicacion, String nombreModulo, String llave) {
        Properties properties = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.getNamedQuery("sql_properties");
        query.setParameter("paramNombreAplicacion", nombreAplicacion);
        query.setParameter("paramNombreModulo", nombreModulo);
        query.setParameter("paramLlave", llave);
        System.out.println("paramNombreAplicacion: " + nombreAplicacion);
        System.out.println("paramNombreModulo: " + nombreModulo);
        System.out.println("paramLlave: " + llave);
        properties = (Properties) query.uniqueResult();
        return properties;
    }
}
