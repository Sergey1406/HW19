package com.example.springdatajdbc.controller;

import com.example.springdatajdbc.repositories.OrderRepository;
import com.example.springdatajdbc.service.Orders;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatcher;
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
public class OrdersControllerTest {
    @InjectMocks
    private OrdersController testOrder;

    @Mock
    private OrderRepository order;

    @Mock
    private Orders orders;

    @Before
    public void init(){

    }

    @Test
    public void ShouldReturnOrderById(){
        Mockito.when(order.findById(1)).thenReturn(Optional.of(orders));
        testOrder.getOrderById(1);
        Mockito.verify(order).findById(1);
    }

    @Test
    public void ShouldReturnAllOrders(){
        Mockito.when(order.findAll()).thenReturn(Collections.singleton(orders));
        testOrder.getOrders();
        Mockito.verify(order).findAll();
    }

    @Test
    public void ShouldDeleteOrderById(){
        testOrder.deleteOrderById(1);
        Mockito.verify(order).deleteById(1);
    }

}