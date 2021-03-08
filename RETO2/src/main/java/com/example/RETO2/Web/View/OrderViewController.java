package com.example.RETO2.Web.View;

import com.example.RETO2.Services.OrderService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("order")
public class OrderViewController {
    private final OrderService orderService;

    OrderViewController(OrderService orderService) {
        this.orderService = orderService;
    }



    @GetMapping
        public ModelAndView products() {
            ModelAndView mv = new ModelAndView("index");
            mv.addObject("order", orderService.getAll());
            return mv;
        }
}