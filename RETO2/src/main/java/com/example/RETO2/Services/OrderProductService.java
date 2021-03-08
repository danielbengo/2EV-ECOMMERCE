package com.example.RETO2.Services;

import java.util.List;
import java.util.stream.Collectors;

import com.example.RETO2.Repositories.Interfaces.OrderProductRepository;
import com.example.RETO2.Services.Models.OrderProductDTO;
import com.example.RETO2.Services.Models.ProductsDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderProductService {
  @Autowired
  private OrderProductRepository orderproductRepository;
  @Autowired
  private ModelMapper modelMapper;

  //public Optional<MovieDTO> findById(Long id) {
    //     Optional<MovieEntity> entidad = moviesRepository.findById(id);
    //     if (entidad.isPresent())
    //       return Optional.of(modelMapper.map(entidad.get(), MovieDTO.class));
    //     else
    //       return Optional.empty();
    //   }

  
    public List<OrderProductDTO> orderProductsById(Long id){
      return orderproductRepository.orderProductsById(id).stream()
                  .map(x -> modelMapper.map(x,OrderProductDTO.class))
                  .collect(Collectors.toList());
                  
  }
}