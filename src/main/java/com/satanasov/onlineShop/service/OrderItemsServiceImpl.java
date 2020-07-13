package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.OrderItems;
import com.satanasov.onlineShop.repository.OrderItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class OrderItemsServiceImpl implements OrderItemsService {
    private final OrderItemsRepository orderItemsRepository;
    @Autowired
    public OrderItemsServiceImpl(OrderItemsRepository orderItemsRepository) {
        this.orderItemsRepository = orderItemsRepository;
    }

    @Override
    public void createOrderItems(OrderItems orderItems) {

    }

    @Override
    public void updateOrderItems(OrderItems orderItems) {

    }

    @Override
    public OrderItems getOrderItemsById(Long orderItemsId) {
        return null;
    }

    @Override
    public List<OrderItems> getAllOrderItems() {
        return null;
    }

    @Override
    public void deleteOrderItemsById(Long orderItemsId) {

    }
}
