package com.satanasov.onlineShop.model;

import java.util.HashSet;
import java.util.Set;

public class ShoppingCart {
    private Long id;
    private Set<Item> items = new HashSet<>();
    private SellerInformation sellerInformation;
    private Double cartTotalPrice;

    public Long getId() {
        return id;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public SellerInformation getSellerInformation() {
        return sellerInformation;
    }

    public void setSellerInformation(SellerInformation sellerInformation) {
        this.sellerInformation = sellerInformation;
    }

    public Double getCartTotalPrice() {
        return cartTotalPrice;
    }

    public void setCartTotalPrice(Double cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }
}
