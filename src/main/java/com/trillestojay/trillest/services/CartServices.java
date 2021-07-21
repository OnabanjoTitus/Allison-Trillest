package com.trillestojay.trillest.services;

import com.trillestojay.trillest.data.model.Cart;
import com.trillestojay.trillest.data.model.Products;

public interface CartServices {
    public Cart createCart();
    void addToCart(Cart cart,Products products);
    void removeFromCart(Cart cart,Products products);
    void emptyCart(Cart cart);
    Cart getCartItems(Cart cart);
}
