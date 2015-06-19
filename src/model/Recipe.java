package main.java.model;

/**
 * File module, class Recipe.java
 * class of recipes
 * Created by Anna on 2015-06-10.
 */
import java.util.ArrayList;

enum eType{
    SOUP, DESSERT, SALAD, STARTER, MAIN_COURSE, DRINK
}
enum eFlavour{
    SWEET, BITTER, SALTY, SOUR, SPICY
}
enum eDifficulty{
    EASY, MEDIUM, HARD
}

public class Recipe {
    private int recipeId;
    private String name;
    private eType type;
    private eDifficulty difficulty;
    private eFlavour flavour;
    //private int time;
    //private int calories;
    //private ArrayList <Product> products;

    public void setRecipeId(int recipeId) {this.recipeId = recipeId;}
    public int getRecipeId() {return recipeId;}
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setType(String type) {
        this.type = eType.valueOf(type);
    }
    public String getType() {

         return type.name();
    }
    public void setFlavour(String flavour) {
        this.flavour = eFlavour.valueOf(flavour);
    }
    public String getFlavour() {
        return flavour.name();
    }
    public void setDifficulty(String difficulty) {
        this.difficulty = eDifficulty.valueOf(difficulty);
    }
    public String getDifficulty() {
        return difficulty.name();
    }
    /*public void setProducts(ArrayList<Product> products) {
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
        return "Recipe [id=" + recipeId + "Name=" + name + ", type=" + type +
                ", flavour=" + flavour + ", difficulty level=" + difficulty + "]";
    }
}