package com.example.myrestaurant;

public class Order {
    
    int quantity;
    Item item;
    
    public Order(Item item, int quantity) {
        
        
        this.item = item;
        this.quantity = quantity;
    }
    
    public Item getItem() {
        
        return item;
    }
    
    public void setItem(Item item) {
        
        this.item = item;
    }
    
    public int getQuantity() {
        
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        
        this.quantity = quantity;
    }
    
}
