package com.mobifone.qhtw.service.impl;

import com.mobifone.qhtw.model.Vendor;
import com.mobifone.qhtw.repository.IVendorRepository;
import com.mobifone.qhtw.service.IVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService implements IVendorService {
    @Autowired
    private IVendorRepository vendorRepository;
    @Override
    public List<Vendor> findAll() {
        return vendorRepository.findAll();
    }

    @Override
    public boolean save(Vendor vendor) {
        return vendorRepository.save(vendor);
    }
}
