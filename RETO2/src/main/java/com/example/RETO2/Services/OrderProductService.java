package com.example.RETO2.Services;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.RETO2.Repositories.Entities.OrderProductEntity;
import com.example.RETO2.Repositories.Interfaces.OrderProductRepository;
import com.example.RETO2.Services.Models.OrderProductDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderProductService {
  @Autowired
  private OrderProductRepository orderproductRepository;
  @Autowired
  private ModelMapper modelMapper;


}