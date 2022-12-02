package com.um.inventorysystem.DataLayer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class StockItem {

   //@Id
    String stockItemId;
    String description;
    int supplierId;
    int salesQuantity;
    double price;
}
