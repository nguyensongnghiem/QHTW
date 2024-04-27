package com.mobifone.qhtw.service.impl;

import com.mobifone.qhtw.model.Site;
import com.mobifone.qhtw.repository.ICshtRepository;
import com.mobifone.qhtw.service.ICshtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CshtService implements ICshtService {
    @Autowired
    private ICshtRepository cshtRepository;
    @Override
    public List<Site> findAll() {
        return cshtRepository.findAll();
    }
}
