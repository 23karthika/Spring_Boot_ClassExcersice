package com.product.product.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductDetails {
    
    @Id
    private int produntId;

    private String ProductName;
    private double price;
    private String description;
    private int quantity;

    

    public ProductDetails() {
    }

    public ProductDetails(int produntId, String productName, double price, String description, int quantity) {
        this.produntId = produntId;
        ProductName = productName;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public int getProduntId() {
        return produntId;
    }

    public void setProduntId(int produntId) {
        this.produntId = produntId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
    
}
