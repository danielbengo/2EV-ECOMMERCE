package com.example.labo4.Web.Config;


import com.example.labo4.Services.MoviesService;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DI {
    @Bean
    MoviesService createMovieService(){
        return new MoviesService();
    }

    @Bean
    ModelMapper createModelMapper(){
        return new ModelMapper();
    }
}
