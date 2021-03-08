package com.example.RETO2.Web.API;

import java.util.List;

import com.example.RETO2.Services.OrderService;
import com.example.RETO2.Services.Models.OrderDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/order")
public class OrderController{

 
    private final OrderService orderService;


  OrderController(OrderService orderService){
      this.orderService = orderService;
  }


  //get all
  @GetMapping()
  public List<OrderDTO> GetOrder(){
      return orderService.getAll();
  }
}