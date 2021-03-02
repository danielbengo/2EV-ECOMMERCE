package com.example.labo4.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Movies")
@Entity(name="Movies")



public class MovieEntity{
    private @Id @GeneratedValue Long id;

    public MovieEntity(){ }

    public MovieEntity(String _title, int _year, String _poster ){
        this.title = _title;
        this.year = _year;
        this.poster = _poster;
        
    }
    
    public Long getId(){
        return id;
    }
    public void setId(Long id) {
        this.id= id;
    }


    private String title;
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title;}

    private int year;
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year;}

    private String poster;
    public String getPoster() { return poster; }
    public void setPoster(String poster) { this.poster = poster;}

    
    
}
