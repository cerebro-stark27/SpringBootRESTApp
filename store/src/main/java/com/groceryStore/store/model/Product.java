package com.groceryStore.store.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "products")
public class Product {
    @Id
    private ObjectId _id;
    private String productName;
    private float price;
    private String descShrt;
    private String descLong;

    //Standard constructors
    public Product() {

    }

    public Product(ObjectId _id, String name, float price, String desc_shrt, String desc_long) {
        this._id = _id;
        this.productName = name;
        this.price = price;
        this.descShrt = desc_shrt;
        this.descLong = desc_long;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getProduct_name() {
        return productName;
    }

    public void setProduct_name(String product_name) {
        this.productName = product_name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public String getDescShrt() {
        return descShrt;
    }

    public void setDescShrt(String descShrt) {
        this.descShrt = descShrt;
    }

    public String getDescLong() {
        return descLong;
    }

    public void setDescLong(String descLong) {
        this.descLong = descLong;
    }
}
