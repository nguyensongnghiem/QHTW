package com.mobifone.qhtw.utils;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;


public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;
    public static EntityManager getEntityManager() {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return entityManager;
    }
}
