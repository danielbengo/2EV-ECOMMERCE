package com.example.RETO2.Web.Config;

import com.example.RETO2.Services.OrderProductService;
import com.example.RETO2.Services.OrderService;
import com.example.RETO2.Services.ProductsService;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DI {
    @Bean
    OrderService createOrderService(){
        return new OrderService();
    }
    @Bean
    ProductsService createProductsService(){
        return new ProductsService();
    }
    @Bean
    OrderProductService createOrderProductService(){
        return new OrderProductService();
    }

    @Bean
    ModelMapper createModelMapper(){
        return new ModelMapper();
    }
}
