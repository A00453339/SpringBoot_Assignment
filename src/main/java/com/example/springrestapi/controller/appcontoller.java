package com.example.springrestapi.controller;

import com.example.springrestapi.entity.hotels;
import com.example.springrestapi.model.hotel_details;
import com.example.springrestapi.repository.hotel_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class appcontoller {

    @Autowired
    private hotel_repo hotel_repository;

    @GetMapping("/")
    public String health_check(){
      return "Health check passed";
    }

    @GetMapping("/hello")
    public String sayHi() {
        return "Hello Canada";
    }

    @GetMapping("/hotel_list")
    public hotels getHotelList(@RequestParam(value = "name",defaultValue = "Marriot") String hname) {
        return new hotels(1, hname);
    }
    @GetMapping("/hotels")
    public List<hotel_details> getAllHotels() {
        return hotel_repository.findAll();
        }

    @PostMapping("/hotels")
    public hotel_details createEmployee(@RequestBody hotel_details hotel_val) {
        return hotel_repository.save(hotel_val);
    }
}
