package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface OrderService {
    void createOrder(Order order);
    void updateOrder(Order order);
    Order getOrderById(Long orderId);
    List<Order> getAllOrders();
    void deleteOrderById(Long orderId);
}
