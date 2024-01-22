package com.example.springdatajdbc.repositories;

import com.example.springdatajdbc.service.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
