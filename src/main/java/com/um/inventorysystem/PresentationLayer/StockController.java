package com.um.inventorysystem.PresentationLayer;

import com.um.inventorysystem.BusinessLayer.StockItemService;
import com.um.inventorysystem.DataLayer.StockItem;

import java.util.List;

//@RequestController
//@RequestMapping("stockItem")
public class StockController {

    //@Autowired
    StockItemService stockItemService;

    //@GetMapping
    public List<StockItem> getAll() {
        return stockItemService.getAll();
    }

}
