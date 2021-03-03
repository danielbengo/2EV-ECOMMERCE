package com.example.RETO2.Web.API;

import com.example.RETO2.Services.OrderProductService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/orderproduct")
public class OrderProductController {

    private final OrderProductService orderproductService;


  OrderProductController(OrderProductService orderproductService){
      this.orderproductService = orderproductService;
  }
}