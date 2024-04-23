package com.mobifone.qhtw.repository;

import com.mobifone.qhtw.model.Csht;
import com.mobifone.qhtw.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class CshtRepository implements ICshtRepository{

    @Override
    public List<Csht> findAll() {
        String queryStr = "FROM Csht";
        EntityManager entityManager = HibernateUtil.getEntityManager();
        TypedQuery<Csht> query = entityManager.createQuery(queryStr, Csht.class);
        List<Csht> listCsht = null;
        try {
            listCsht = query.getResultList();
            if (listCsht == null || listCsht.isEmpty() ) {
                listCsht=null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            entityManager.close();
        }
        return listCsht;
    }
}
