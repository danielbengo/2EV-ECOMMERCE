package com.example.RETO2.Repositories.Entities;



@Table(name = "Order")
@Entity(name="Order")

public class OrderEntity{
//uso este autoincrementable en vez de el de dentro de los constructores
    private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Long idorder;

   

    public Order(String fecha, String nombreusuario, String estado){
        this.fecha = fecha;
        this.nombreusuario = nombreusuario;
        this.estado = estado;
         //otro autoincrementable
        

    }
    //getters y setters 
    private String fecha;
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha;}

    private String nombreusuario;
    public String getNombreusuario() { return nombreusuario; }
    public void setNombreusuario(String nombreusuario) { this.nombreusuario = nombreusuario;}

    private String estado;
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado;}

    
    public int getIdorder() { return idorder; }
    public void setIdorder(int idorder) { this.idorder = idorder;}

    //constructores vacios solo con el autoincrem en los 3 models
    public Order(){ 
        
    }
}