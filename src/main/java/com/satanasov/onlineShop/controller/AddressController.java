package com.satanasov.onlineShop.controller;

import com.satanasov.onlineShop.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class AddressController {

    @PostMapping
    public String createAddress(@RequestBody User user){
        return "Hello ".concat(user.getFirstName());
    }
    @GetMapping("/test")
    private String test(){
        return "Hello";
    }
}
