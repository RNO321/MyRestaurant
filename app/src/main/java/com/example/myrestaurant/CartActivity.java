package com.example.myrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class CartActivity extends AppCompatActivity {
    
    ListView listView;
    ArrayList<Order> orders;
    Button clear_btn;
    TextView cartTotal;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        
        //get intent
        
        Intent intent = getIntent();
        
        //init list view
        
        listView = findViewById(R.id.shopping_cart_list);
        
        orders = ShoppingCart.orders;
        
        for(int i = 0; i < ShoppingCart.ordered_items.length; i++) {
            if(ShoppingCart.ordered_items[i] != 0) {
                
                int itemID = i;
                int quantity = ShoppingCart.ordered_items[i];
                orders.get(i).setQuantity(quantity);
            }
        }
        
        cartTotal = findViewById(R.id.cart_total);
        cartTotal.setText(String.format("$%.2f", ShoppingCart.total));
        
        listView.setAdapter(new CartAdapter(this, orders));
        
        // clear button
        
        clear_btn = findViewById(R.id.clear_btn);
        
        clear_btn.setOnClickListener(new View.OnClickListener() {
            
                                         @Override
                                         public void onClick(View v) {
                
                                             ShoppingCart.total = 0.0;
                                             ShoppingCart.ordered_items = new int[16];
                                             ShoppingCart.orders = new ArrayList<>(Arrays.asList(
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
                                             recreate();
                
                                         }
                                     }
        );
        
    }
    
    
}