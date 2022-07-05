package com.example.Product.entities;

import org.springframework.stereotype.Component;

@Component
public class Product {

    private String productName;
    private int productId;
    private String productPrice;
    private String productDesc;
    private boolean isAvailable;

    public Product() {
    }

    public Product(String productName, int productId, String productPrice, String productDesc, boolean isAvailable) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.productDesc = productDesc;
        this.isAvailable = isAvailable;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
