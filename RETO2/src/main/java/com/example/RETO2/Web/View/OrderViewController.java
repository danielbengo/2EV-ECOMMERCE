package com.example.RETO2.Web.View;

import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;

import com.example.labo4.Repositories.Entities.MovieEntity;
import com.example.labo4.Services.MoviesService;
import com.example.labo4.Services.Models.MovieDTO;
import com.example.labo4.Web.API.MoviesController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("order")
public class OrderViewController {
    private final OrderService orderService;

    OrderViewController(OrderService orderService) {
        this.orderService = orderService;
    }
}