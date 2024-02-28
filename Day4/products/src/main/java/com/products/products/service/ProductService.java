package com.products.products.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.products.products.model.Product;
import com.products.products.repository.ProductRepo;

@Service
public class ProductService {
    
    private ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product saveDetails(Product product)
    {
        return productRepo.save(product);
    }

    public List<Product> listofDetails()
    {
        return productRepo.findAll();
    }

    public Product getId(int productId)
    {
        return productRepo.findById(productId).orElse(null);
    }
    
}
