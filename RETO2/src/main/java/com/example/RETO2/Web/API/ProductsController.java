package com.example.RETO2.Web.API;

import java.util.List;

import com.example.RETO2.Services.ProductsService;
import com.example.RETO2.Services.Models.ProductsDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/product")
public class ProductsController {

    private final ProductsService productsService;


    ProductsController(ProductsService productsService){
        this.productsService = productsService;
    }


    //get all
  @GetMapping()
  public List<ProductsDTO> GetProduct(){
      return productsService.getAll();
  }

}