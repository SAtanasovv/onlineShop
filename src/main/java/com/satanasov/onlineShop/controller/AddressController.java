package com.satanasov.onlineShop.controller;

import com.satanasov.onlineShop.model.Address;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/{addressId}")
    public Address getAddress(@PathVariable Long addressId){
        return null;

    }
    @DeleteMapping("/{addressId}")
    public void deleteAddress(@PathVariable("addressId") Long addressId){

    }

}
