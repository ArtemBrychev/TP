package com.example;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private int category_id; 

    public int getId(){return id;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public int getCategory_id(){return category_id;}

    public void setId(int id){this.id =  id;}
    public void setName(String name){this.name = name;}
    public void setPrice(double price){this.price = price;}
    public void setCategory_id(int category_id){this.category_id = category_id;}

    @Override
    public String toString(){
        return "ID(" + id + ") NAME(" + name + ") PRICE(" + price + ") CATEGORY_ID(" + category_id + ")";
    }
}
