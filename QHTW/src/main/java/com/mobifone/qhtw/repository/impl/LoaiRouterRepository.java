package com.mobifone.qhtw.repository.impl;

import com.mobifone.qhtw.model.RouterType;
import com.mobifone.qhtw.repository.ILoaiRouterRepository;
import com.mobifone.qhtw.utils.HibernateUtil;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class LoaiRouterRepository implements ILoaiRouterRepository {
    @Override
    public List<RouterType> findAll() {
        String queryStr = "FROM RouterType ";
        EntityManager entityManager = HibernateUtil.getEntityManager();
        TypedQuery<RouterType> query = entityManager.createQuery(queryStr, RouterType.class);
        List<RouterType> RouterTypes = query.getResultList();
        return RouterTypes;
    }

    @Override
    public boolean save(RouterType routerType) {
        try {
            EntityManager entityManager = HibernateUtil.getEntityManager();
            entityManager.persist(routerType);
            return true;
        } catch (Exception e) {
            return false;

        }
    }
}
