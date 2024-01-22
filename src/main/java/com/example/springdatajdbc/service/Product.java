package com.example.springdatajdbc.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Setter
@Getter

public class Product {
    @Id
    private Integer id;
    private Integer orders_id;
    private int cost;
    private String name;

    public Product(int cost, String name){
        this.cost = cost;
        this.name = name;
    }
}
