package com.ecommerce.ProductService.services.factory;

import com.ecommerce.ProductService.models.Clothing;
import com.ecommerce.ProductService.models.Product;

import java.util.Map;

public class ClothingFactory extends ProductFactory {
    @Override
    public Product createProduct(long merchantId, Map<String, Object> input) {
        return Clothing.create(merchantId, input);
    }
}
