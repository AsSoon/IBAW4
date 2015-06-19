package main.java.model;

//uwazac na nazewnictwo - FRIGDE i PRODUKT (jeden obiekt lodowka to jeden produkt

public class Fridge {
	    private String name;
	    private int amount;
	    private int productID;
	    private int userID;
	    //dorobiæ pochodne klasy dla róznych typów sk³adników gdzie iloœæ
	    // bêdzie zale¿eæ od typu sk³adnika np. ml dla p³ynów,
	    // gramy dla sypkich ???

	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setAmount(int amount) {
	        this.amount = amount;
	    }
	    public int getAmount() {
	        return amount;
	    }
	    public void setProductID(int productID) {
	        this.productID = productID;
	    }
	    public int getProductID() {
	        return productID;
	    }
	    public void setUserID(int userID) {
	        this.userID = userID;
	    }
	    public int getUserID() {
	        return userID;
	    }
}
