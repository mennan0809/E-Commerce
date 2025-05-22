package com.ecommerce.ProductService.models.enums;

import com.ecommerce.ProductService.services.factory.AccessoryFactory;
import com.ecommerce.ProductService.services.factory.ClothingFactory;
import com.ecommerce.ProductService.services.factory.ProductFactory;

public enum ProductCategory {
    CLOTHING(ClothingFactory.class),
    ACCESSORY(AccessoryFactory.class);

    private final Class<? extends ProductFactory> factoryClass;

    ProductCategory(Class<? extends ProductFactory> factoryClass) {
        this.factoryClass = factoryClass;
    }

    public ProductFactory getFactoryInstance() {
        try {
            return factoryClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Cannot instantiate factory for: " + this.name(), e);
        }
    }
}
