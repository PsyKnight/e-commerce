package com.ishanya.ecommerce.payment;

import com.ishanya.ecommerce.customer.CustomerResponse;
import com.ishanya.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
