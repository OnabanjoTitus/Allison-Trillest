package com.trillestojay.trillest.services;

import com.trillestojay.trillest.data.model.Cart;
import com.trillestojay.trillest.data.model.Products;
import com.trillestojay.trillest.data.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServicesImpl implements CartServices{
    @Autowired
    UserServices userServices;
    @Autowired
    CartRepository cartRepository;

    @Override
    public Cart createCart() {
        return createNewCart();
    }

    private Cart createNewCart() {
        return cartRepository.save(new Cart());
    }

    @Override
    public void addToCart(Cart cart,Products products) {
        cart.getProductsList().add(products);
    }

    @Override
    public void removeFromCart(Cart cart,Products products) {
        cart.getProductsList().remove(products);
    }

    @Override
    public void emptyCart(Cart cart) {
        userServices.emptyCart(cart);
    }

    @Override
    public Cart getCartItems(Cart cart) {
        return cart;
    }
}
