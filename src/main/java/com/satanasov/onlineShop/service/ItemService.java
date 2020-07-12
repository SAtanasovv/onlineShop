package com.satanasov.onlineShop.service;


import com.satanasov.onlineShop.model.Address;
import com.satanasov.onlineShop.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    void createItem(Item item);
    void updateItem(Item item);
    Item getItemById(Long itemId);
    List<Item> getAllItems();
    void deleteItemById(Long itemId);
}
