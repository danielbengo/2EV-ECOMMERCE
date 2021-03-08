package com.example.RETO2.Services.Models;

import com.example.RETO2.Repositories.Entities.OrderEntity;
import com.example.RETO2.Repositories.Entities.ProductsEntity;

public class OrderProductDTO {
    
    public OrderEntity orderEntity;
    public ProductsEntity productsEntity;

  
   
    private Long orderproductid;
    private int cantidad;
   

    public Long getOrderproductid(){
        return orderproductid;
    }
    public void setOrderproductid(Long orderproductid) {
        this.orderproductid= orderproductid;
    }
    public OrderEntity getOrder() { return orderEntity; }
    public void setOrder(OrderEntity orderEntity) { this.orderEntity = orderEntity;}

    public ProductsEntity getProducts() { return productsEntity; }
    public void setProducts(ProductsEntity productsEntity) { this.productsEntity = productsEntity;}


    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad= cantidad;
    }

   
}