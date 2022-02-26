package com.example.springrestapi.repository;

import com.example.springrestapi.model.hotel_details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface hotel_repo extends JpaRepository<hotel_details,Long> {
}
