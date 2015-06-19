package main.java.model;

/**
 * File module, class Product.java
 * class of products used in Recipe or present in Fridge
 * Created by Anna on 2015-06-10.
 */
enum eProdtype {
    LOOSE, LIQUID, SPICE, MEAT, FISH, VEGETABLE, FRUIT
}

public class Product{
    private int productId;
    private String name;
    private eProdtype productType;
    private int amount; //-->dopiero w przepisie i lodowce?
    //dorobić pochodne klasy dla róznych typów składników gdzie ilość
    // będzie zależeć od typu składnika np. ml dla płynów,
    // gramy dla sypkich ???

    public void setProductId(int product_id) {
        this.productId = productId;
    }
    public int getProductId() {
        return productId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setProductType(eProdtype productType) {
        this.productType= productType;
    }
    public eProdtype getProductType() {
        return productType;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }

}