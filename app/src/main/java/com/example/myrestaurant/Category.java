package com.example.myrestaurant;

public class Category {
    String category;
    int imageID;

    public Category (String category, int image) {
        this.category = category;
        this.imageID = image;
    }

    public String getCategory () {
        return category;
    }

    public void setCategory (String category) {
        this.category = category;
    }

    public int getImageID () {
        return imageID;
    }

    public void setImageID (int imageID) {
        this.imageID = imageID;
    }
}
