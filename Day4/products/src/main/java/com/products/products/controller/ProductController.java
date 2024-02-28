package com.products.products.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.products.products.model.Product;
import com.products.products.service.ProductService;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/productdetails")
    public ResponseEntity<Product> productDetails(@RequestBody Product product){
        Product producDetails=productService.saveDetails(product);
        if(producDetails!=null)
        {
            return new ResponseEntity<>(producDetails,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(producDetails,HttpStatus.NOT_FOUND);
    }
    
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getDetails(){
        List<Product>li=productService.listofDetails();
        if(li!=null)
        {
            return new ResponseEntity<>(li,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(li,HttpStatus.NOT_FOUND);
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<Product> getProductsById(@PathVariable int productId)
    {
        Product prodetails=productService.getId(productId);
        if(prodetails!=null)
        {
            return new ResponseEntity<>(prodetails,HttpStatus.CREATED);   
        }
        return new ResponseEntity<>(prodetails,HttpStatus.CREATED);
    }
    
}
