package com.mobifone.qhtw.service.impl;

import com.mobifone.qhtw.model.Province;
import com.mobifone.qhtw.repository.ITinhRepository;
import com.mobifone.qhtw.service.ITinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TinhService implements ITinhService {
    @Autowired
    private ITinhRepository tinhRepository;
    @Override
    public List<Province> findAll() {
        return tinhRepository.findAll();
    }

    @Override
    public boolean save(Province province) {
        return tinhRepository.save(province);
    }
}
