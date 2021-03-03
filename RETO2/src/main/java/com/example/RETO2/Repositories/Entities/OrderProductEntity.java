package com.example.RETO2.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "OrderProduct")
@Entity(name="OrderProduct")

public class OrderProductEntity{




private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Long orderproductid;


    //public OrderProduct(){ }
 public OrderProductEntity(){
     
 }
    public OrderProductEntity(int cantidad, OrderEntity idorder, ProductsEntity idproduct){
        this.cantidad=cantidad;
        this.idorder=idorder;
        this.idproduct = idproduct;

        //intentar un set cambiar el oderproductid
        // al valor de autoincremid y hacerle un ++??????? (TESTEAR)
      
    }

    //getters y setters 
    private int cantidad;
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad;}

    private OrderEntity idorder;
    public OrderEntity getOrder() { return idorder; }
    public void setOrder(OrderEntity idorder) { this.idorder = idorder;}

    private ProductsEntity idproduct;
    public ProductsEntity getProducts() { return idproduct; }
    public void setProducts(ProductsEntity idproduct) { this.idproduct = idproduct;}
   
    public Long getOrderproductid() { return orderproductid; }
    public void setOrderproductid(Long orderproductid) { this.orderproductid = orderproductid;}
    
    


    // public int getAutoincremId() {
    //     return autoincremId;
    // }

    // public void setAutoincremId(int autoincremId) {
    //     this.autoincremId = autoincremId;
    // }

    
}