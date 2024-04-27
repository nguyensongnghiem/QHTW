package com.mobifone.qhtw.service.impl;

import com.mobifone.qhtw.model.TelecomCenter;
import com.mobifone.qhtw.repository.IDaiVtRepository;
import com.mobifone.qhtw.service.IDaiVtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DaiVtService implements IDaiVtService {


    @Autowired
    private IDaiVtRepository daiVtRepository;
    @Override
    public List<TelecomCenter> findAll() {
        return daiVtRepository.findAll();
    }
    @Override
    public boolean save(TelecomCenter telecomCenter) {
        return daiVtRepository.save(telecomCenter);
    }
}
