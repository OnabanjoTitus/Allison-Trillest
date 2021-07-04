package com.trillestojay.trillest.data.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productId;
    @ManyToOne
    private Cart cart;
}
