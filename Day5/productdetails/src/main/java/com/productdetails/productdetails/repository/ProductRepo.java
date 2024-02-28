package com.productdetails.productdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productdetails.productdetails.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

    
} 
