/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pettopia.model.bean;

/**
 *
 * @author Passant
 */
public class Product {

    private int id;
    private String name;
    private double price;
    private String quantity;
    private String description;
    private String category;

    public Product(){}
    public Product(int id,String name, double price, String quantity, String description,String category) {
        this.id=id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.category=category;
    }

    public String getCategory(){
        return category;
    }
    
    public  void setCategory(String category){
        this.category=category;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

}
