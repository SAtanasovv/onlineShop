package com.satanasov.onlineShop.controller;

import com.satanasov.onlineShop.model.Address;
import com.satanasov.onlineShop.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {
    @PostMapping
    public void createUser(@RequestBody User user) {

    }

    @PutMapping
    public void updateUser(@RequestBody User user) {

    }
    @GetMapping
    public List<User> getAllAUsers() {
        return null;

    }
    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId){
        return null;

    }
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){

    }
}
