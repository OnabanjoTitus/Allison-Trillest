package com.trillestojay.trillest.data.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDto {
    private Integer productId;
    private String productName;
    private String productImage;
    private BigDecimal productPrice;
}
