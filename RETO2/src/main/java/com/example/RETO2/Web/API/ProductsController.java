package com.example.RETO2.Web.API;



@RestController
@RequestMapping("v1/product")
public class OrderController{

    private final MoviesService moviesService;


    MoviesController(MoviesService moviesService){
        this.moviesService = moviesService;
    }
}