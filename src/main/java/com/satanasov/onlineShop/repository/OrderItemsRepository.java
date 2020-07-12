package com.satanasov.onlineShop.repository;

import com.satanasov.onlineShop.model.OrderItems;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemsRepository extends CrudRepository<OrderItems,Long> {
}
