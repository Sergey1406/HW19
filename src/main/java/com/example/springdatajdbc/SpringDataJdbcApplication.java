package com.example.springdatajdbc;

import com.example.springdatajdbc.repositories.OrderRepository;
import com.example.springdatajdbc.repositories.ProductRepository;
import com.example.springdatajdbc.service.Orders;
import com.example.springdatajdbc.service.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJdbcApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringDataJdbcApplication.class, args);
    }

    @Bean
    CommandLineRunner orderSave(OrderRepository
                                       orders){
      return args -> {
      orders.save(new Orders("Vanya", 54));
            };
    }


    @Bean
    CommandLineRunner productsSave(ProductRepository products, OrderRepository
            orders){
        return args -> {
            products.save(new Product(35, "Keyboard"));
        };
    }



}
