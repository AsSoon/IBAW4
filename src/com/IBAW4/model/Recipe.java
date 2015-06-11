package com.IBAW4.model;

/**
 * File module, class Recipe.java
 * class of recipes
 * Created by Anna on 2015-06-10.
 */
import java.util.ArrayList;

enum e_type{
    SOUP, DESSERT, SALAD, STARTER, MAIN_COURSE, DRINK
}
enum e_flavour{
    SWEET, BITTER, SALTY, SOUR
}
enum e_difficulty{
    EASY, MEDIUM, HARD
}

public class Recipe {
    private String name;
    private e_type type;
    private e_difficulty difficulty;
    private e_flavour flavour;
    //private int time;
    //private int calories;
    private ArrayList <Product> products;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setType(e_type type) {
        this.type = type;
    }
    public e_type getType() {
        return type;
    }
    public void setFlavour(e_flavour flavour) {
        this.flavour = flavour;
    }
    public e_flavour getFlavour() {
        return flavour;
    }
    public void setDifficulty(e_difficulty difficulty) {
        this.difficulty = difficulty;
    }
    public e_difficulty getDifficulty() {
        return difficulty;
    }
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    public ArrayList<Product> getProducts() {
        return products;
    }
    /*public void addProducts(Product product){
      this.products.add(product) ;
    }*/
    @Override
    public String toString() {
        return "Recipe [Name=" + name + "products=" + products + ", type=" + type
                + ", flavour=" + flavour + ", difficulty level=" + difficulty + "]";
    }
}