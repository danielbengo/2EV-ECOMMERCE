package com.example.RETO2.Web.API;

import com.example.RETO2.Services.OrderService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/order")
public class OrderController{

 
    private final OrderService orderService;


  OrderController(OrderService orderService){
      this.orderService = orderService;
  }
}