package com.productdetails.productdetails.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productdetails.productdetails.model.Product;
import com.productdetails.productdetails.service.ProductService;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/api/product")
    public ResponseEntity<Product> postDetails(@RequestBody Product product)
    {
        Product a=productService.post(product);
        if(a!=null)
        {
            return new ResponseEntity<>(a,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(a,HttpStatus.NOT_FOUND);
    }

    @PutMapping("/api/product/{productId}")
    public ResponseEntity<Product> putDetails(@PathVariable int productId,@RequestBody Product product)
    {
        Product b=productService.put(product);
        if(b!=null)
        {
            return new ResponseEntity<>(b,HttpStatus.OK);
        }
        return new ResponseEntity<>(b,HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/api/product/{productId}")
    public ResponseEntity<Product> deleteProduct(@PathVariable int productId)
    {
        Product c=productService.delete(productId);
        if(c!=null)
        {
            return new ResponseEntity<>(c,HttpStatus.OK);
        }
        return new ResponseEntity<>(c,HttpStatus.NOT_FOUND);
    }
}
