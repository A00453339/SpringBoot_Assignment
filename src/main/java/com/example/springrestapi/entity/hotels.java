package com.example.springrestapi.entity;

public class hotels {

    private int id;
    private String hotel_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public hotels(int id, String hotel_name) {
        this.id = id;
        this.hotel_name = hotel_name;
    }



}
