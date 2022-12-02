package com.um.inventorysystem.PresentationLayer;

import com.um.inventorysystem.BusinessLayer.StockItemService;
import com.um.inventorysystem.DataLayer.StockItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("stockItem")
public class StockController {

    @Autowired
    StockItemService stockItemService;

    @GetMapping
    public List<StockItem> getAll() {
        return stockItemService.getAll();
    }

}
