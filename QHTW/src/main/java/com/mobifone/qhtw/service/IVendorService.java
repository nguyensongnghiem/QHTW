package com.mobifone.qhtw.service;

import com.mobifone.qhtw.model.Vendor;

import java.util.List;

public interface IVendorService {
    public List<Vendor> findAll();
    public boolean save(Vendor vendor);
}
