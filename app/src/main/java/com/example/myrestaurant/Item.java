package com.example.myrestaurant;

public class Item extends Category {
    
    String name;
    String description;
    double price;
    int itemID;
    
    public Item(String category, String name, String description, double price, int imageID, int itemID) {
        
        super(category, imageID);
        this.name = name;
        this.description = description;
        this.price = price;
        this.itemID = itemID;
    }
    
    public int getItemID() {
        
        return itemID;
    }
    
    public void setItemID(int itemID) {
        
        this.itemID = itemID;
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
    
}
