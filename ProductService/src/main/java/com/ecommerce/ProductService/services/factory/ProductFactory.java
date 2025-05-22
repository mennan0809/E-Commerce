package com.ecommerce.ProductService.services.factory;

import com.ecommerce.ProductService.models.Product;
import com.ecommerce.ProductService.models.enums.ProductCategory;
import java.util.Map;

public abstract class ProductFactory {

    public abstract Product createProduct(long merchantId, Map<String, Object> input);

}