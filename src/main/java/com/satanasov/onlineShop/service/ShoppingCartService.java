package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShoppingCartService {
    void createShoppingCart(ShoppingCart shoppingCart);
    void updateShoppingCart(ShoppingCart shoppingCart);
    ShoppingCart getShoppingCartById(Long shoppingCartId);
    List<ShoppingCart> getAllShoppingCarts();
    void deleteAddressById(Long shoppingCartId);
}
