package com.mobifone.qhtw.repository;

import com.mobifone.qhtw.model.Vendor;

import java.util.List;

public interface IVendorRepository {
    public List<Vendor> findAll();
    public boolean save(Vendor vendor);
}
