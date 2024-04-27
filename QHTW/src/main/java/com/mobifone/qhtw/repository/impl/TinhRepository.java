package com.mobifone.qhtw.repository.impl;

import com.mobifone.qhtw.model.Province;
import com.mobifone.qhtw.repository.ITinhRepository;
import com.mobifone.qhtw.utils.HibernateUtil;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class TinhRepository implements ITinhRepository {
    @Override
    public List<Province> findAll() {
        String queryStr = "FROM Province";
        EntityManager entityManager = HibernateUtil.getEntityManager();
        TypedQuery<Province> query = entityManager.createQuery(queryStr, Province.class);
        List<Province> provinces = query.getResultList();
        return provinces;
    }

    @Override
    public boolean save(Province province) {
        EntityManager entityManager = HibernateUtil.getEntityManager();
        entityManager.persist(province);
        return false;
    }
}
