package com.example.springdatajdbc;

import com.example.springdatajdbc.repositories.OrderRepository;
import com.example.springdatajdbc.service.Orders;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class SpringDataJdbcApplicationTest {
    @Mock
    private SpringDataJdbcApplication app;

    @Mock
    private OrderRepository order;


    @Before
    public void init(){

    }

    @Test
    public void ShouldTestSaveOrder(){

        Mockito.when(app.orderSave(order));

    }



}