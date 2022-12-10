package com.um.inventoryservice.BusinessLayer;

import com.um.inventoryservice.DataLayer.StockItem;
import com.um.inventoryservice.DataLayer.StockItemDTO;
import com.um.inventoryservice.DataLayer.StockItemRepo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StockItemService {

    Flux<StockItemDTO> getAll();
    Mono<StockItemDTO> insertStock(Mono<StockItemDTO> stockItemMono);

}
