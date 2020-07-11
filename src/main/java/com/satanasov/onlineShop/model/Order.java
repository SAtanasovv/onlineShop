package com.satanasov.onlineShop.model;

import java.util.HashSet;
import java.util.Set;

public class Order {
    private Long id;
    private Set<OrderItems> items = new HashSet<>();
    private Payment payment;
    private Shipment shipment;
    private User user;

    public Long getId() {
        return id;
    }

    public Set<OrderItems> getItems() {
        return items;
    }

    public void setItems(Set<OrderItems> items) {
        this.items = items;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
