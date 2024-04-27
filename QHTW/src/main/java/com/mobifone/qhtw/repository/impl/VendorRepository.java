package com.mobifone.qhtw.repository.impl;

import com.mobifone.qhtw.model.Vendor;
import com.mobifone.qhtw.repository.IVendorRepository;
import com.mobifone.qhtw.utils.HibernateUtil;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class VendorRepository implements IVendorRepository {
    @Override
    public List<Vendor> findAll() {
        String queryStr = "FROM Vendor";
        EntityManager entityManager = HibernateUtil.getEntityManager();
        TypedQuery<Vendor> query = entityManager.createQuery(queryStr, Vendor.class);
        List<Vendor> dsVendor = query.getResultList();
        return dsVendor;
    }

    @Override
    public boolean save(Vendor vendor) {
        try {
            EntityManager entityManager = HibernateUtil.getEntityManager();
            entityManager.persist(vendor);
            return true;
        } catch (Exception e) {
            return false;

        }
    }
}
