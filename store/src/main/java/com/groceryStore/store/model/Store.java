package com.groceryStore.store.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "stores")
public class Store {
    @Id
    private ObjectId _id;
    private String storeName;
    private List<Product> products;

    //Standard constructors
    public Store() {

    }

    public Store(ObjectId _id, String name, List<Product> products) {
        this.storeName = name;
    }

    //Standard getters and setters
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Store{" + "id='" + _id + '\'' + ", storeName='" + storeName + '\'' +
                '}';
    }

}
