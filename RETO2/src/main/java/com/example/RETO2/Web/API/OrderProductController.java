package com.example.RETO2.Web.API;

import java.util.List;

import com.example.RETO2.Services.OrderProductService;
import com.example.RETO2.Services.Models.OrderProductDTO;
import com.example.RETO2.Services.Models.ProductsDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/orderproduct")
public class OrderProductController {

    private final OrderProductService orderproductService;


  OrderProductController(OrderProductService orderproductService){
      this.orderproductService = orderproductService;
  }
 
  @GetMapping("/{id}")
  public List<OrderProductDTO> Get(@PathVariable("id") Long id){
    return orderproductService.orderProductsById(id);
  }
  
  //añadi
  // @PostMapping
  // public OrderProductDTO AddOrderProd(@RequestBody OrderProductDTO ordpro){
  //   return orderproductService.add(ordpro)
  // }

   //update
  //  @PutMapping("/{id}")
  //  public OrderProductDTO UpdateOrderProd(@RequestBody OrderProductDTO ordpro, @PathVariable("id")Long id){
  //    return orderproductService.UpdateOrderProdate(id, ordpro);
  //  }

    //añadir
  // @PostMapping
  // public OrderProductDTO AddOrderProd(@RequestBody OrderProductDTO ordpro){
  //   return orderproductService.add(ordpro)
  // }
}