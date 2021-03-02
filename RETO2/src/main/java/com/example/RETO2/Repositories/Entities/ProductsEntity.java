package com.example.RETO2.Repositories.Entities;

@Table(name = "Products")
@Entity(name="Products")

public class Products{
    private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Long idproducto;

    public Products(String nombre, double precio, String url){
       
        
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
    
    
    public int getIdproducto() { return idproducto; }
    public void setIdproducto(int idproducto) { this.idproducto = idproducto;}


    public Products() {
        
    }


}