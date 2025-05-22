package com.ecommerce.ProductService.services.factory;

import com.ecommerce.ProductService.models.Accessory;
import com.ecommerce.ProductService.models.Product;

import java.util.Map;

public class AccessoryFactory extends ProductFactory {
    @Override
    public Product createProduct(long merchantId, Map<String, Object> input) {
        return Accessory.create(merchantId, input);
    }
}
