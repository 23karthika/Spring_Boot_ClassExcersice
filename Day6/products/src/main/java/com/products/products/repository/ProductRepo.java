package com.products.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.products.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{

    
}