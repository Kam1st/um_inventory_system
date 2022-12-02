package com.um.inventorysystem.BusinessLayer;

import com.um.inventorysystem.DataLayer.StockItem;
import com.um.inventorysystem.DataLayer.StockItemRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StockItemServiceImpl {

    @Autowired
    StockItemRepo stockItemRepo;

    public List<StockItem> getAll() {
        return stockItemRepo.findAll();
    }
}
