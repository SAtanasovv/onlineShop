package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.ShoppingCart;
import com.satanasov.onlineShop.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShoppingCartServiceImpl implements ShoppingCartService {
    private final ShoppingCartRepository shoppingCartRepository;
    @Autowired
    public ShoppingCartServiceImpl(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    @Override
    public void createShoppingCart(ShoppingCart shoppingCart) {

    }

    @Override
    public void updateShoppingCart(ShoppingCart shoppingCart) {

    }

    @Override
    public ShoppingCart getShoppingCartById(Long shoppingCartId) {
        return null;
    }

    @Override
    public List<ShoppingCart> getAllShoppingCarts() {
        return null;
    }

    @Override
    public void deleteAddressById(Long shoppingCartId) {

    }
}
