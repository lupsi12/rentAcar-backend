package com.example.rentAcar.dataAccess.abstracts;

import com.example.rentAcar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand,Integer>{
    boolean existsByName(String name);//spring jpa keywords exists avr mı yok mu
}
