package com.example.RETO2.Web.API;



@RestController
@RequestMapping("v1/order")
public class OrderController{

 
    private final OrderService orderService;


  OrderController(OrderService orderService){
      this.orderService = orderService;
  }
}