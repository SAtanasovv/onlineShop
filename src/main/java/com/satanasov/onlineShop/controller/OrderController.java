package com.satanasov.onlineShop.controller;


import com.satanasov.onlineShop.model.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/orders")
public class OrderController {

    @PostMapping
    public void createOrder(@RequestBody Order order) {

    }

    @PutMapping
    public void updateOrder(@RequestBody Order order) {

    }
    @GetMapping
    public List<Order> getAllOrders() {
        return null;

    }
    @GetMapping("/{orderId}")
    public Order getOrder(@PathVariable Long orderId){
        return null;

    }
    @DeleteMapping("/{orderId}")
    public void deleteOrder(@PathVariable("orderId") Long orderId){

    }

}
