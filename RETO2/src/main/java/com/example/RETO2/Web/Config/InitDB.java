package com.example.labo4.Web.Config;

import com.example.labo4.Repositories.Entities.MovieEntity;

import com.example.labo4.Repositories.Interfaces.MoviesRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDB {
 @Bean
 CommandLineRunner initDatabase(  MoviesRepository repository) {

    return args -> {
        repository.save(new MovieEntity("Avatar", 2009,"https://m.media-amazon.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_SX300.jpg"));
        repository.save(new MovieEntity("Scream", 1996,"https://m.media-amazon.com/images/M/MV5BMjA2NjU5MTg5OF5BMl5BanBnXkFtZTgwOTkyMzQxMDE@._V1_SX300.jpg"));
        repository.save(new MovieEntity("LOL", 2009,"https://m.media-amazon.com/images/M/MV5BMTA0MjI5ODA3MjReQTJeQWpwZ15BbWU3MDI1NTE3Njc@._V1_SX300.jpg"));
        repository.save(new MovieEntity("TRON", 1982,"https://m.media-amazon.com/images/M/MV5BMzZhNjYyZDYtZmE4MC00M2RlLTlhOGItZDVkYTVlZTYxOWZlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg"));

    };

    
 }
    


}
