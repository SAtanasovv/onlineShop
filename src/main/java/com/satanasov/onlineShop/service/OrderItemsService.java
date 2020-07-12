package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.Address;
import com.satanasov.onlineShop.model.OrderItems;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderItemsService {
    void createOrderItems(OrderItems orderItems);
    void updateOrderItems(OrderItems orderItems);
    OrderItems getOrderItemsById(Long orderItemsId);
    List<OrderItems> getAllOrderItems();
    void deleteOrderItemsById(Long orderItemsId);
}
