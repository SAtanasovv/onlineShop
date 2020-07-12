package com.satanasov.onlineShop.controller;

import com.satanasov.onlineShop.model.Address;
import com.satanasov.onlineShop.model.Item;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/items")
public class ItemController {


    @PostMapping
    public void createItem(@RequestBody Item item) {

    }

    @PutMapping
    public void updateItem(@RequestBody Item item) {

    }
    @GetMapping
    public List<Item> getAllItems() {
        return null;

    }
    @GetMapping("/{itemId}")
    public Item getItem(@PathVariable Long itemId){
        return null;

    }
    @DeleteMapping("/{itemId}")
    public void deleteItem(@PathVariable("itemId") Long itemId){

    }
}
