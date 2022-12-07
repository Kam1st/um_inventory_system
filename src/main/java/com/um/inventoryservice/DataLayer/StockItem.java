package com.um.inventoryservice.DataLayer;


import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockItem {

    @Id
    private String id;

    String stockItemId;
    String description;
    int supplierId;
    int salesQuantity;
    double price;
}
