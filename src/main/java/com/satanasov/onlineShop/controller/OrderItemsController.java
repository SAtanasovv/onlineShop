package com.satanasov.onlineShop.controller;

import com.satanasov.onlineShop.model.Address;
import com.satanasov.onlineShop.model.OrderItems;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/orderItems")
public class OrderItemsController {

    @PostMapping
    public void createOrderItems(@RequestBody OrderItems orderItems) {

    }

    @PutMapping
    public void updateOrderItems(@RequestBody OrderItems orderItems) {

    }
    @GetMapping
    public List<OrderItems> getAllOrderItems() {
        return null;

    }
    @GetMapping("/{orderItemsId}")
    public Address getOrderItems(@PathVariable Long orderItemsId){
        return null;

    }
    @DeleteMapping("/{orderItemsId}")
    public void deleteOrderItems(@PathVariable("orderItemsId") Long orderItemsId){

    }
}
