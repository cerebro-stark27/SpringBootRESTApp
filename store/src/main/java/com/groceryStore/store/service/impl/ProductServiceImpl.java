package com.groceryStore.store.service.impl;

import com.groceryStore.store.model.Product;
import com.groceryStore.store.repository.ProductRepository;
import com.groceryStore.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product findByProductName(String productName) {
        return productRepository.findByProductName(productName);
    }

//    @Override
//    public Product findByProductID(String productID) {
//        return productRepository.findByProductID(productID);
//    }

    @Override
    public Product findByDescShrt(String descShrt) {
        return productRepository.findByDescShrt(descShrt);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product saveOrUpdateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(String id) {

    }

    //if we need to some business logic,
    // we should not write this code block in controller.
    // Because of this, the service layer is needed.



}
