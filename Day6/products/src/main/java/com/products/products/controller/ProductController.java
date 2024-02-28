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
    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        if(productService.saveProduct(product)!=null){
            return new ResponseEntity<>(product,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(product,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    
    @GetMapping("/{offset}/{pagesize}")
    public ResponseEntity<List<Product>> getProduct(@PathVariable int offset, @PathVariable int pagesize){
        List<Product> p = productService.getProductPage(offset, pagesize);
        if(p!=null){
            return new ResponseEntity<>(p,HttpStatus.OK);
        }
        return new ResponseEntity<>(p,HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{offset}/{pagesize}/{field}")
    public ResponseEntity<List<Product>> getSortedPage(@PathVariable int offset, @PathVariable int pagesize,@PathVariable String field){
        List<Product> p = productService.productSortedPage(offset, pagesize,field);
        if(p!=null){
            return new ResponseEntity<>(p,HttpStatus.OK);
        }
        return new ResponseEntity<>(p,HttpStatus.NOT_FOUND);
    }
    
    @GetMapping("{productId}")
    public ResponseEntity<Product> getProductbyid(@PathVariable int productId){
        Product p = productService.productId(productId);
        if(p!=null){
            return new ResponseEntity<>(p,HttpStatus.OK);
        }
        return new ResponseEntity<>(p,HttpStatus.NOT_FOUND);
        
    }

}
