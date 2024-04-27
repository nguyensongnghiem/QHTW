package com.mobifone.qhtw.repository.impl;

import com.mobifone.qhtw.model.Site;
import com.mobifone.qhtw.repository.ICshtRepository;
import com.mobifone.qhtw.utils.HibernateUtil;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CshtRepository implements ICshtRepository {

    @Override
    public List<Site> findAll() {
        String queryStr = "FROM Site";
        EntityManager entityManager = HibernateUtil.getEntityManager();
        TypedQuery<Site> query = entityManager.createQuery(queryStr, Site.class);
        List<Site> listSite = query.getResultList();
        return listSite;
    }
}