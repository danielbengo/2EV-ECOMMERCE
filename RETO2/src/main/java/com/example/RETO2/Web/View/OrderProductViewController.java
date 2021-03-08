package com.example.RETO2.Web.View;

import com.example.RETO2.Services.OrderProductService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orderproduct")
public class OrderProductViewController {
    private final OrderProductService orderproductService;

    OrderProductViewController(OrderProductService orderproductService) {
        this.orderproductService = orderproductService;
    }
}