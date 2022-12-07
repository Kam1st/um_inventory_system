package com.um.inventoryservice.DataLayer;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockItemDTO {
    String stockItemId;
    String description;
    int supplierId;
    int salesQuantity;
    double price;
}
