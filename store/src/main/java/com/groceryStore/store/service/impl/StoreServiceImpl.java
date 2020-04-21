package com.groceryStore.store.service.impl;

import com.groceryStore.store.model.Store;
import com.groceryStore.store.repository.StoreRepository;
import com.groceryStore.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreRepository storeRepository;

//    @Override
//    public Store findByStoreID(String store_id) {
//        return storeRepository.findByStoreID(store_id);
//    }

    @Override
    public Store findByStoreName(String store_name) {
        return storeRepository.findByStoreName(store_name);
    }

    @Override
    public List<Store> findAll() {
        return storeRepository.findAll();
    }

    @Override
    public Store saveOrUpdateStore(Store store) {
        return storeRepository.save(store);

    }

    @Override
    public void deleteStore(String id) {

    }

}
