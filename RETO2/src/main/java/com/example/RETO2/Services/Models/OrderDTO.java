package com.example.RETO2.Services.Models;

public class OrderDTO {
    
    private String nombreusuario;
    private String fecha;
    private String estado;
    private Long idorder;
   

    public Long getIdorder(){
        return idorder;
    }
    public void setIdorder(Long idorder) {
        this.idorder= idorder;
    }

    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha= fecha;
    }

    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado) {
        this.estado=estado ;
    }

    public String getNombreusuario(){
        return nombreusuario;
    }
    public void setNombreusuario(String Nombreusuario) {
        this.nombreusuario= nombreusuario;
    }
}