package com.ecommerce.PaymentService.services.Factory;

import com.ecommerce.PaymentService.services.strategy.CreditCardStrategy;
import com.ecommerce.PaymentService.services.strategy.PaymentStrategy;
import org.springframework.stereotype.Component;

@Component
public class CreditCardStrategyFactory implements PaymentStrategyFactory {

    @Override
    public PaymentStrategy createPaymentStrategy(Long userId, String token, Object... params) {
        return new CreditCardStrategy(
                (String) params[0], // cardNumber
                (String) params[1], // expiryDate
                (String) params[2]  // cvv
        );
    }
}
