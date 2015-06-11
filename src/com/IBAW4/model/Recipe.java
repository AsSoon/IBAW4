package com.daniel.model;

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
    SWEET, BITTER, SALTY, SOUR, SPICY
}
enum e_difficulty{
    EASY, MEDIUM, HARD
}

public class Recipe {
    private int recipe_id;
    private String name;
    private e_type type;
    private e_difficulty difficulty;
    private e_flavour flavour;
    private String instruction;
    //private int time;
    //private int calories;
    private ArrayList <Product> products;

    public void setRecipe_id(int recipe_id) {this.recipe_id = recipe_id;}
    public int getRecipe_id() {return recipe_id;}
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
    public String getInstruction() {
        return instruction;
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
        return "Recipe [id=" + recipe_id + "Name=" + name + "products=" + products
                + ", type=" + type + ", flavour=" + flavour + ", difficulty level="
                + difficulty + "]";
    }
}