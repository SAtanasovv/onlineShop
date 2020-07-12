package com.satanasov.onlineShop.controller;

import com.satanasov.onlineShop.model.Address;
import com.satanasov.onlineShop.model.Payment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/payments")
public class PaymentController {
    @PostMapping
    public void createPayment(@RequestBody Payment payment) {

    }

    @PutMapping
    public void updatePayment(@RequestBody Payment payment) {

    }
    @GetMapping
    public List<Payment> getAllPayments() {
        return null;

    }
    @GetMapping("/{paymentId}")
    public Payment getPayment(@PathVariable Long paymentId){
        return null;

    }
    @DeleteMapping("/{paymentId}")
    public void deletePayment(@PathVariable("paymentId") Long paymentId){

    }
}
