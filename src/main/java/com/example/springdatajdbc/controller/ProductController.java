package com.example.springdatajdbc.controller;

import com.example.springdatajdbc.repositories.ProductRepository;
import com.example.springdatajdbc.service.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductRepository productRepository;

    @GetMapping("/product")
    @PostConstruct
    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }
    @GetMapping("/order/{id}")
    public Product getProductById(@PathVariable("id") Integer id){
        return productRepository.findById(id).get();
    }

    @GetMapping("/order/{id}")
    public void deleteProductById(@PathVariable("id") Integer id){
        productRepository.deleteById(id);
    }
}
