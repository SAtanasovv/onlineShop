package com.satanasov.onlineShop.repository;

import com.satanasov.onlineShop.model.ShoppingCart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends CrudRepository<ShoppingCart,Long> {
}
