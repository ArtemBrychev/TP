package com.example;

import jakarta.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public void setName(String name){this.name = name;}

    public String getName(){return name;}

    public int getId(){return id;}

    @Override
    public String toString(){
        return "Id(" + id + ") Name(" + name + ")";
    }
}
