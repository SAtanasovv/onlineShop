package com.satanasov.onlineShop.controller;

import com.satanasov.onlineShop.model.Address;
import com.satanasov.onlineShop.model.SellerInformation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/sellerInformation")
public class SellerInformationController {
    @PostMapping
    public void createSellerInformation(@RequestBody SellerInformation sellerInformation) {

    }

    @PutMapping
    public void updateSellerInformation(@RequestBody SellerInformation sellerInformation) {

    }
    @GetMapping
    public List<SellerInformation> getAllSellerInformation() {
        return null;

    }
    @GetMapping("/{sellerInformationId}")
    public Address getSellerInformation(@PathVariable Long sellerInformationId){
        return null;

    }
    @DeleteMapping("/{sellerInformationId}")
    public void deleteSellerInformation(@PathVariable("sellerInformationId") Long sellerInformationId){

    }
}
