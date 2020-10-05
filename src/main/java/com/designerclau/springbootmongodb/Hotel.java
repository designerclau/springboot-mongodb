package com.designerclau.springbootmongodb;

import com.mongodb.client.model.Collation;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Indexed;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Hotels")
public class Hotel {

    @Id
    private String id;
    private String name;
    private int pricepernight;
    private Address address;
    private List<Review> reviews;

    protected Hotel(){}

    //public Hotel(){}


    public Hotel(String name, int pricepernight, Address address, List<Review> reviews) {
        this.name = name;
        this.pricepernight = pricepernight;
        this.address = address;
        this.reviews = reviews;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPricepernight() {
        return pricepernight;
    }




 }


