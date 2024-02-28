package com.products.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.products.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {

    
} 