package com.groceryStore.store.controller;

import com.groceryStore.store.model.Product;
import com.groceryStore.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/")
    public List<Product> getAllProducts() {
        return productService.findAll();
    }

    @GetMapping(value = "/{productName}")
    public Product getProductByProductName(@PathVariable("product_name") String product_name) {
        return productService.findByProductName(product_name);
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> saveOrUpdateProduct(@RequestBody Product product) {
        productService.saveOrUpdateProduct(product);
        return new ResponseEntity("Product added successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
    }
}

