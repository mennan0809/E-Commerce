package com.ecommerce.PaymentService.services.Factory;

import com.ecommerce.PaymentService.services.strategy.*;
import org.springframework.stereotype.Service;

@Service
public interface PaymentStrategyFactory {
    PaymentStrategy createPaymentStrategy(Long userId, String token, Object... params);
}
