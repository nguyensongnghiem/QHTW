package com.mobifone.qhtw.repository;

import com.mobifone.qhtw.model.Province;

import java.util.List;

public interface ITinhRepository {
    public List<Province> findAll();
    public boolean save(Province province);
}
