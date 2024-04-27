package com.mobifone.qhtw.service;

import com.mobifone.qhtw.model.RouterType;

import java.util.List;

public interface ILoaiRouterService {
    public List<RouterType> findAll();
    public boolean save(RouterType routerType);
}
