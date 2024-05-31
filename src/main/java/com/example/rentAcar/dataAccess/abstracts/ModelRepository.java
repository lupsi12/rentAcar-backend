package com.example.rentAcar.dataAccess.abstracts;

import com.example.rentAcar.entities.concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Integer> {
}
