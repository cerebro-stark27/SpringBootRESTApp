package com.groceryStore.store.service;

import com.groceryStore.store.model.Product;

import java.util.List;

public interface ProductService {

    Product findByProductName(String productName);

//    Product findByProductID(String productID);

    Product findByDescShrt(String descShrt);

    List<Product> findAll();

    Product saveOrUpdateProduct(Product product);

    void deleteProduct(String id);
}
