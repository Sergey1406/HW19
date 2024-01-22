package com.example.springdatajdbc.controller;

import com.example.springdatajdbc.repositories.OrderRepository;
import com.example.springdatajdbc.repositories.ProductRepository;
import com.example.springdatajdbc.service.Product;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.Optional;

import static org.junit.Assert.*;
@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {

    @InjectMocks
    private ProductController testOrder;

    @Mock
    private ProductRepository product;

    @Mock
    private Product products;

    @Before
    public void init(){

    }

    @Test
    public void ShouldReturnProductById(){
        Mockito.when(product.findById(1)).thenReturn(Optional.of(products));
        testOrder.getProductById(1);
        Mockito.verify(product).findById(1);
    }

    @Test
    public void ShouldReturnAllProducts(){
        Mockito.when(product.findAll()).thenReturn(Collections.singleton(products));
        testOrder.getProducts();
        Mockito.verify(product).findAll();
    }

    @Test
    public void ShouldDeleteProductById(){
        testOrder.deleteProductById(1);
        Mockito.verify(product).deleteById(1);
    }

}