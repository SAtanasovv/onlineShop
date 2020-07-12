package com.satanasov.onlineShop.controller;

import com.satanasov.onlineShop.model.Address;
import com.satanasov.onlineShop.model.ShoppingCart;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/shoppingCart")
public class ShoppingCartController {

    @PostMapping
    public void createShoppingCart(@RequestBody ShoppingCart shoppingCart) {

    }

    @PutMapping
    public void updateShoppingCart(@RequestBody ShoppingCart shoppingCart) {

    }
    @GetMapping
    public List<ShoppingCart> getAllShoppingCart() {
        return null;

    }
    @GetMapping("/{shoppingCartId}")
    public ShoppingCart getShoppingCart(@PathVariable Long shoppingCartId){
        return null;

    }
    @DeleteMapping("/{shoppingCartId}")
    public void deleteShoppingCart(@PathVariable("shoppingCartId") Long shoppingCartId){

    }
}
