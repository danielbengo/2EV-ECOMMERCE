package com.example.RETO2.Services;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.RETO2.Repositories.Entities.ProductsEntity;
import com.example.RETO2.Repositories.Interfaces.ProductsRepository;
import com.example.RETO2.Services.Models.ProductsDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductsService {
  @Autowired
  private ProductsRepository productsRepository;
  @Autowired
  private ModelMapper modelMapper;


}