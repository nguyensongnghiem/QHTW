package com.mobifone.qhtw.service.impl;

import com.mobifone.qhtw.model.RouterType;
import com.mobifone.qhtw.repository.ILoaiRouterRepository;
import com.mobifone.qhtw.service.ILoaiRouterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoaiRouterService implements ILoaiRouterService {
    @Autowired
    private ILoaiRouterRepository loaiRouterRepository;
    @Override
    public List<RouterType> findAll() {
        return loaiRouterRepository.findAll();
    }

    @Override
    public boolean save(RouterType routerType) {
        return loaiRouterRepository.save(routerType);
    }
}
