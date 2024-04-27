package com.mobifone.qhtw.service;

import com.mobifone.qhtw.model.TelecomCenter;

import java.util.List;

public interface IDaiVtService {
    public List<TelecomCenter> findAll();
    public boolean save(TelecomCenter telecomCenter);

}
