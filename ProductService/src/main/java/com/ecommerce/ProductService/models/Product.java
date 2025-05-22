package com.ecommerce.ProductService.models;


import jakarta.persistence.*;

import java.util.Map;

@Entity
@Table(name = "products")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generates the UID automatically
    private long uid; // The unique identifier for each product

    protected String name;
    protected double price;
    protected String brand;
    protected String color;
    protected Long merchantId;
    protected int stockLevel;

    public Product() {
        // Empty constructor for reflection
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    // common setters
    public void setCommonAttributes(Map<String, Object> input, long merchantId) {
        this.merchantId = merchantId;
        this.name = (String) input.get("name");
        this.price = (Double) input.get("price");
        this.brand = (String) input.get("brand");
        this.color = (String) input.get("color");
        this.stockLevel = (input.get("stockLevel") != null) ? (Integer) input.get("stockLevel") : 0;
    }


    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }
}