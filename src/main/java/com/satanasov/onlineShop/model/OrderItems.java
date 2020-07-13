package com.satanasov.onlineShop.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="order_items")
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_items_id")
    private ShoppingCart cartItems;
    @Column
    private Double orderTotalPrice;

    public Long getId() {
        return id;
    }

    public Iterable<ShoppingCart> getCartItems() {
        return null;
    }

    public void setCartItems(Iterable<ShoppingCart> cartItems) {
        //this.cartItems = cartItems;
    }

    public Double getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(Double orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }
}
