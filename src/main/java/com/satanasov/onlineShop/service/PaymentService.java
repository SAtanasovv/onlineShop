package com.satanasov.onlineShop.service;


import com.satanasov.onlineShop.model.Address;
import com.satanasov.onlineShop.model.Payment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PaymentService {
    void createPayment(Payment payment);
    void updatePayment(Payment payment);
    Payment getPaymentById(Long paymentId);
    List<Payment> getAllPayments();
    void deletePaymentById(Long paymentId);
}
