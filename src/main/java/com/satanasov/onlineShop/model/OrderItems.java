package com.satanasov.onlineShop.model;

import java.util.HashSet;
import java.util.Set;

public class OrderItems {
    private Long id;
    private Set<ShoppingCart> cartItems = new HashSet<>();
    private Double orderTotalPrice;

    public Long getId() {
        return id;
    }

    public Set<ShoppingCart> getCartItems() {
        return cartItems;
    }

    public void setCartItems(Set<ShoppingCart> cartItems) {
        this.cartItems = cartItems;
    }

    public Double getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(Double orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }
}
