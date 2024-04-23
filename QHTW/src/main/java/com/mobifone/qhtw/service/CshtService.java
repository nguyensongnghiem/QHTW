package com.mobifone.qhtw.service;

import com.mobifone.qhtw.model.Csht;
import com.mobifone.qhtw.repository.ICshtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CshtService implements ICshtService{
    @Autowired
    private ICshtRepository cshtRepository;
    @Override
    public List<Csht> findAll() {
        return cshtRepository.findAll();
    }
}
