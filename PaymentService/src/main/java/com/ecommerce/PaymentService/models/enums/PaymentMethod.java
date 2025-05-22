package com.ecommerce.PaymentService.models.enums;

import com.ecommerce.PaymentService.services.Factory.PaymentStrategyFactory;
import com.ecommerce.PaymentService.services.Factory.CreditCardStrategyFactory;
import com.ecommerce.PaymentService.services.Factory.WalletStrategyFactory;

public enum PaymentMethod {
    CREDIT_CARD(CreditCardStrategyFactory.class),
    WALLET(WalletStrategyFactory.class);

    private final Class<? extends PaymentStrategyFactory> factoryClass;

    PaymentMethod(Class<? extends PaymentStrategyFactory> factoryClass) {
        this.factoryClass = factoryClass;
    }

    public PaymentStrategyFactory getFactoryInstance() {
        try {
            return factoryClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Cannot instantiate factory for: " + this.name(), e);
        }
    }
}
