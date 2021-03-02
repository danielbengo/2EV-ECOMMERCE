package com.example.RETO2.Repositories.Entities;

@Table(name = "OrderProduct")
@Entity(name="OrderProduct")

public class OrderProduct{




private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Long orderproductid;


    //public OrderProduct(){ }
 public OrderProduct(){
     
 }
    public OrderProduct(int cantidad, Order order, Products product){
        this.cantidad=cantidad;
        this.order=order;
        this.products = product;

        //intentar un set cambiar el oderproductid
        // al valor de autoincremid y hacerle un ++??????? (TESTEAR)
      
    }

    //getters y setters 
    private int cantidad;
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad;}

    private OrderEntity idorder;
    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order;}

   
    public int getOrderproductid() { return orderproductid; }
    public void setOrderproductid(int orderproductid) { this.orderproductid = orderproductid;}
    
    private ProductsEtity idproduct;
    public Products getProducts() { return products; }
    public void setProducts(Products products) { this.products = products;}


    // public int getAutoincremId() {
    //     return autoincremId;
    // }

    // public void setAutoincremId(int autoincremId) {
    //     this.autoincremId = autoincremId;
    // }

    
}