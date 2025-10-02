package com.ishanya.ecommerce.kafka;

import com.ishanya.ecommerce.customer.CustomerResponse;
import com.ishanya.ecommerce.order.PaymentMethod;
import com.ishanya.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
