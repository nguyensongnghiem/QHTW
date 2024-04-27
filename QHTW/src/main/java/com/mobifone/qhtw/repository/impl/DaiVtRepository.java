package com.mobifone.qhtw.repository.impl;

import com.mobifone.qhtw.model.TelecomCenter;
import com.mobifone.qhtw.repository.IDaiVtRepository;
import com.mobifone.qhtw.utils.HibernateUtil;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class DaiVtRepository implements IDaiVtRepository {
    @Override
    public List<TelecomCenter> findAll() {
        String queryStr = "FROM TelecomCenter";
        EntityManager entityManager = HibernateUtil.getEntityManager();
        TypedQuery<TelecomCenter> query = entityManager.createQuery(queryStr, TelecomCenter.class);
        List<TelecomCenter> telecomCenters = query.getResultList();
        return telecomCenters;
    }

    @Override
    public boolean save(TelecomCenter telecomCenter) {
        try {
            EntityManager entityManager = HibernateUtil.getEntityManager();
            entityManager.persist(telecomCenter);
            return true;
        } catch (Exception e) {
            return false;

        }
    }

}
