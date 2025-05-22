package com.ecommerce.UserService.models.enums;

import com.ecommerce.UserService.services.factory.CustomerFactory;
import com.ecommerce.UserService.services.factory.MerchantFactory;
import com.ecommerce.UserService.services.factory.UserFactory;

public enum UserRole {
    CUSTOMER(CustomerFactory.class),
    MERCHANT(MerchantFactory.class);

    private final Class<? extends UserFactory> factoryClass;

    UserRole(Class<? extends UserFactory> factoryClass) {
        this.factoryClass = factoryClass;
    }

    public UserFactory getFactoryInstance() {
        if (factoryClass == null) {
            throw new UnsupportedOperationException("No factory available for role: " + this.name());
        }
        try {
            return factoryClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Cannot instantiate factory for: " + this.name(), e);
        }
    }
}
