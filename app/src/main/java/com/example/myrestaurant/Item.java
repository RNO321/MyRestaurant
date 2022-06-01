package com.example.myrestaurant;

public class Item {

    String category;
    String name;
    String description;
    double price;
    int image;

    public Item (String category, String name, String description, double price, int image) {
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
    }

    public int getImage () {
        return image;
    }

    public void setImage (int image) {
        this.image = image;
    }

    public String getCategory () {
        return category;
    }

    public void setCategory (String category) {
        this.category = category;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice (double price) {
        this.price = price;
    }
}
