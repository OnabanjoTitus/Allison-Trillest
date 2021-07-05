package com.trillestojay.trillest.services;

import com.trillestojay.trillest.data.model.Cart;
import com.trillestojay.trillest.data.model.Products;
import com.trillestojay.trillest.data.model.User;
import com.trillestojay.trillest.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements UserServices {

    @Override
    public void pickCart(User user) {
      user.setCart(new Cart());
    }

    @Override
    public void emptyCart(Cart cart) {
        cart.setProductsList(null);
    }

    @Override
    public List<Products> Checkout(Cart cart) {
        return cart.getProductsList();
    }
}
