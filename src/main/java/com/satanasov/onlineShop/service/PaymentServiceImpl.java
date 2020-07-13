package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.Payment;
import com.satanasov.onlineShop.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;
    @Autowired
    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void createPayment(Payment payment) {

    }

    @Override
    public void updatePayment(Payment payment) {

    }

    @Override
    public Payment getPaymentById(Long paymentId) {
        return null;
    }

    @Override
    public List<Payment> getAllPayments() {
        return null;
    }

    @Override
    public void deletePaymentById(Long paymentId) {

    }
}
