package com.um.inventoryservice.BusinessLayer;

import com.um.inventoryservice.DataLayer.StockItemDTO;
import com.um.inventoryservice.DataLayer.StockItemRepo;
import com.um.inventoryservice.util.EntityDtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StockItemServiceImpl implements StockItemService {

    @Autowired
    StockItemRepo stockItemRepo;

    @Override
    public Flux<StockItemDTO> getAll() {
        return stockItemRepo.findAll()
                .map(EntityDtoUtil::toDTO);
    }

    @Override
    public Mono<StockItemDTO> insertStock(Mono<StockItemDTO> stockItemDTOMono) {
        return stockItemDTOMono
                .map(EntityDtoUtil::toEntity)
//                .doOnNext(e -> e.(EntityDtoUtil.generateStockId()))
                .flatMap((stockItemRepo::save))
                .map(EntityDtoUtil::toDTO);
    }
}
