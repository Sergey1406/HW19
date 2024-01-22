package com.example.springdatajdbc.repositories;
import com.example.springdatajdbc.service.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Orders, Integer>{
}
