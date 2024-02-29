package com.example.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.model.Product;
import com.example.product.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public ResponseEntity<Product> post(@RequestBody Product product) {

        try {
            Product store = productService.postProduct(product);
            return new ResponseEntity<>(store, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/product/startsWithName/{value}")
    public ResponseEntity<List<Product>> getStart(@PathVariable("value") String value) {
        List<Product> productbystart = productService.getproductByStart(value);
        if (productbystart != null) {
            return new ResponseEntity<>(productbystart, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/product/endsWithName/{value}")
    public ResponseEntity<List<Product>> getEnd(@PathVariable("value") String value) {
        List<Product> productbyend = productService.getproductByEnd(value);
        if (productbyend != null) {
            return new ResponseEntity<>(productbyend, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/product/sortBy/{field}")
    public ResponseEntity<List<Product>> getSort(@PathVariable("field") String field) {
        List<Product> li = productService.productSort(field);

        if (li.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(li, HttpStatus.OK);
    }

}
