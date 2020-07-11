package com.satanasov.onlineShop.model;

import com.satanasov.onlineShop.model.enums.PaymentMethod;
import com.satanasov.onlineShop.model.enums.PaymentType;

public class Payment {
    private Long id;
    private PaymentMethod paymentMethod= PaymentMethod.CREDIT;
    private PaymentType paymentType= PaymentType.BG;

    public Long getId() {
        return id;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
