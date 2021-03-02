package com.example.RETO2.Services;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.RETO2.Repositories.Entities.OrderEntity;
import com.example.RETO2.Repositories.Interfaces.OrderRepository;
import com.example.RETO2.Services.Models.OrderDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {
  @Autowired
  private OrderRepository orderRepository;
  @Autowired
  private ModelMapper modelMapper;


}