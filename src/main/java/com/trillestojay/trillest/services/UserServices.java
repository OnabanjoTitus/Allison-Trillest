package com.trillestojay.trillest.services;

import com.trillestojay.trillest.data.model.Cart;
import com.trillestojay.trillest.data.model.Products;
import com.trillestojay.trillest.data.model.User;

import java.util.List;

public interface UserServices {
    void pickCart(User user);
    void emptyCart(Cart cart);
    List<Products> Checkout(Cart cart);
}
