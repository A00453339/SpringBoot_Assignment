package com.example.springrestapi.model;

import javax.persistence.*;

@Entity
@Table(name = "hotel_details")
public class hotel_details {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private String price;
    @Column(name = "available")
    private boolean available;
    public hotel_details() {
    }
    public hotel_details(String name, String price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    }

