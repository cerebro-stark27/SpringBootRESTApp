package com.groceryStore.store.service;

import com.groceryStore.store.model.Store;

import java.util.List;

public interface StoreService {

//    Store findByStoreID(String store_id);

    Store findByStoreName(String store_name);

    List<Store> findAll();

    Store saveOrUpdateStore(Store store);

    void deleteStore(String id);


}
