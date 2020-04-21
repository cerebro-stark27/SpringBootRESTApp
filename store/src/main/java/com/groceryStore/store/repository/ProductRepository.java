package com.groceryStore.store.repository;

import com.groceryStore.store.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {

//    Product findByProductID(String id);

    Product findByProductName(String productName);

    Product findByDescShrt(String descShrt);

    List<Product> findAll();
}
