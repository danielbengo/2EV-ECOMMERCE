package com.example.RETO2.Web.API;



@RestController
@RequestMapping("v1/orderproduct")
public class OrderController{

    private final OrderProductService orderproductService;


  OrderProductController(OrderProductService orderproductService){
      this.orderproductService = orderproductService;
  }
}