package com.mobifone.qhtw.repository;

import com.mobifone.qhtw.model.RouterType;

import java.util.List;

public interface ILoaiRouterRepository {
    public List<RouterType> findAll();
    public boolean save(RouterType routerType);
}
