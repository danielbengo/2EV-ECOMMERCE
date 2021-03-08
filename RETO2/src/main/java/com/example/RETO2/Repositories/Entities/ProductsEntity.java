package com.example.RETO2.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Products")
@Entity(name="Products")

public class ProductsEntity{
    private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Long idproduct;

    public ProductsEntity(String nombre, double precio, String url){
       
        
        this.nombre = nombre;
        this.precio = precio;
        this.url = url;
        // this.idproducto = idproducto;

    }

    private String nombre;
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre;}

    private String url;
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url;}

    private double precio;
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio;}
    
    
    public Long getIdproduct() { return idproduct; }
    public void setIdproduct(Long idproduct) { this.idproduct = idproduct;}


    public ProductsEntity() {
        
    }


}