package com.example.rentAcar.entities.concretes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "plate", unique = true)
    private String plate;

    @Column(name = "dailyPrice")
    private double dailyPrice;

    @Column(name = "modelYear")
    private String modelYear;

    @Column(name = "state")
    private int state;// 1-)available 2-)rented 3-)maintenance  satates

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;



}
