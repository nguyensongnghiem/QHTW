package com.mobifone.qhtw.repository;

import com.mobifone.qhtw.model.TelecomCenter;

import java.util.List;

public interface IDaiVtRepository {
    public List<TelecomCenter> findAll();
    public boolean save(TelecomCenter telecomCenter);
}
