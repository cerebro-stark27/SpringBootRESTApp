package com.groceryStore.store.repository;

import com.groceryStore.store.model.Store;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StoreRepository extends MongoRepository<Store, String> {

        Store findBy_id(ObjectId _id);

        Store findByStoreName(String store_name);

        List<Store> findAll();
}
