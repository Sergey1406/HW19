package com.example.springdatajdbc.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Setter
@Getter
public class Orders {
    @Id
    private Integer id;
    private String name;
    private Integer cost;


    public Orders(String name, Integer cost){
        this.name = name;
        this.cost = cost;
    }

}
