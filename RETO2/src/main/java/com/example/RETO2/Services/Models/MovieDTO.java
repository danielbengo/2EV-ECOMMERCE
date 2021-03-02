package com.example.labo4.Services.Models;

public class MovieDTO {
    
    private String title;
    private int year;
    private String poster;
    private Long id;
   

    public Long getId(){
        return id;
    }
    public void setId(Long id) {
        this.id= id;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year) {
        this.year= year;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title=title ;
    }

    public String getPoster(){
        return poster;
    }
    public void setPoster(String poster) {
        this.poster= poster;
    }
}
