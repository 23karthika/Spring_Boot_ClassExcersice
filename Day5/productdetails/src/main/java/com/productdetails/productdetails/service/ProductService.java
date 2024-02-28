package com.productdetails.productdetails.service;

import org.springframework.stereotype.Service;

import com.productdetails.productdetails.model.Product;
import com.productdetails.productdetails.repository.ProductRepo;

@Service
public class ProductService {
    private ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product getByIdToDelete(int productId) {
        return productRepo.findById(productId).orElse(null);

    }

    public Product post(Product product)
    {
        return productRepo.save(product);
    }

    public Product put(Product product)
    {
        return productRepo.save(product);
    }

    public Product delete(int productId)
    {
        Product a=getByIdToDelete(productId);
        if(a==null)
        {
            return null;
        }
        productRepo.deleteById(productId);
        return a;
    }
}
