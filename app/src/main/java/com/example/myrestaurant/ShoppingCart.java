package com.example.myrestaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCart {
    
    static double total;
    static int[] ordered_items = new int[16];
    static ArrayList<Order> orders = new ArrayList<>(Arrays.asList(
            new Order(Database.items.get(0), 0),
            new Order(Database.items.get(1), 0),
            new Order(Database.items.get(2), 0),
            new Order(Database.items.get(3), 0),
            new Order(Database.items.get(4), 0),
            new Order(Database.items.get(5), 0),
            new Order(Database.items.get(6), 0),
            new Order(Database.items.get(7), 0),
            new Order(Database.items.get(8), 0),
            new Order(Database.items.get(9), 0),
            new Order(Database.items.get(10), 0),
            new Order(Database.items.get(11), 0),
            new Order(Database.items.get(12), 0),
            new Order(Database.items.get(13), 0),
            new Order(Database.items.get(14), 0),
            new Order(Database.items.get(15), 0)
    ));
    
}
