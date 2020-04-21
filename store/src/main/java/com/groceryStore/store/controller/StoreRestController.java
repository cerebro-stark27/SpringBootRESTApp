package com.groceryStore.store.controller;

import com.groceryStore.store.model.Product;
import com.groceryStore.store.model.Store;
import com.groceryStore.store.service.ProductService;
import com.groceryStore.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreRestController {
    @Autowired
    private StoreService storeService;

    @GetMapping(value = "/")
    public List<Store> getAllProducts() {
        return storeService.findAll();
    }

    @GetMapping(value = "/{storeName}")
    public Store getStoreByStoreName(@PathVariable("storeName") String storeName) {
        return storeService.findByStoreName(storeName);
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> saveOrUpdatStore(@RequestBody Store store) {
        storeService.saveOrUpdateStore(store);
        return new ResponseEntity("Store added successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteStre(@PathVariable String id) {
        storeService.deleteStore(id);
    }
}
