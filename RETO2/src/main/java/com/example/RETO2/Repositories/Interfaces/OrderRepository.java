package com.example.RETO2.Repositories.Interfaces;

import java.util.Collection;

import com.example.labo4.Repositories.Entities.MovieEntity;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderRepository
extends JpaRepository<OrderEntity,Long>{
   
    

   
}