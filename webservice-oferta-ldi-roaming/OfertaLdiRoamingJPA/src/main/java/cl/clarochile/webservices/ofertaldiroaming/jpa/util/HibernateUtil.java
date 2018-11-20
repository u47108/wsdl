/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.clarochile.webservices.ofertaldiroaming.jpa.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author luisnunez
 */
public class HibernateUtil {

    private HibernateUtil() {
    }

    private static SessionFactory sessionFactory = configureSessionFactory();
    private static ServiceRegistry serviceRegistry;

    public static Session getSession() {
        Session sess = sessionFactory.openSession();
        return sess;
    }

    private static SessionFactory configureSessionFactory() throws HibernateException {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void setSessionFactory(SessionFactory sessionFactory) {
        HibernateUtil.sessionFactory = sessionFactory;
    }

    public static ServiceRegistry getServiceRegistry() {
        return serviceRegistry;
    }

    public static void setServiceRegistry(ServiceRegistry serviceRegistry) {
        HibernateUtil.serviceRegistry = serviceRegistry;
    }

}
