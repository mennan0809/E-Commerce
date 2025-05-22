package com.ecommerce.PaymentService.services.Factory;

import com.ecommerce.PaymentService.clients.UserServiceClient;
import com.ecommerce.PaymentService.services.strategy.PaymentStrategy;
import com.ecommerce.PaymentService.services.strategy.WalletStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WalletStrategyFactory implements PaymentStrategyFactory {

    private final UserServiceClient userServiceClient;

    @Autowired
    public WalletStrategyFactory(UserServiceClient userServiceClient) {
        this.userServiceClient = userServiceClient;
    }

    @Override
    public PaymentStrategy createPaymentStrategy(Long userId, String token, Object... params) {
        return new WalletStrategy(userId, token, userServiceClient);
    }
}
