package com.trillestojay.trillest.data.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Data
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productId;
    private String productName;
    private String productImage;
    private BigDecimal productPrice;
    @ManyToOne
    private Cart cart;
}
