package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.Item;
import com.satanasov.onlineShop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;
    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void createItem(Item item) {

    }

    @Override
    public void updateItem(Item item) {

    }

    @Override
    public Item getItemById(Long itemId) {
        return null;
    }

    @Override
    public List<Item> getAllItems() {
        return null;
    }

    @Override
    public void deleteItemById(Long itemId) {

    }
}
