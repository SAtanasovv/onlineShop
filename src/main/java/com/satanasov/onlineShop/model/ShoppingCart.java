package com.satanasov.onlineShop.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="shopping_cart")
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @ManyToMany
//    @JoinTable(
//            name="shoppingCart_items",
//            joinColumns = @JoinColumn(name="shoppingCart_id"),
//            inverseJoinColumns = @JoinColumn(name = "item_id")
//    )
//    private Iterable<Item> items ;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "seller_information_id")
    private SellerInformation sellerInformation;
    @Column
    private Double cartTotalPrice;

    public Long getId() {
        return id;
    }

//    public Iterable<Item> getItems() {
//        return items;
//    }
//
//    public void setItems(Iterable<Item> items) {
//        this.items = items;
//    }

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
