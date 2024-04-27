package com.mobifone.qhtw.service;

import com.mobifone.qhtw.model.Province;

import java.util.List;

public interface ITinhService {
    public List<Province> findAll();
    public boolean save(Province province);
}
