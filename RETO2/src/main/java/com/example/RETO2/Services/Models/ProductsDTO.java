package com.example.RETO2.Services.Models;

public class ProductsDTO {
    
    private String nombre;
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre;}

    private String url;
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url;}

    private double precio;
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio;}
    
    private int idproducto;
    public int getIdproducto() { return idproducto; }
    public void setIdproducto(int idproducto) { this.idproducto = idproducto;}

   
}