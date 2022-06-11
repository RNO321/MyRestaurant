package com.example.myrestaurant;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    
    String name;
    Item clicked_item;
    Button add_btn;
    SharedPreferences preferences;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        
        Intent intent = getIntent();
        
        if(intent != null) {
            name = intent.getStringExtra("item_name");
        }
        
        for(Item item : Database.items) {
            if(item.getName().equals(name)) {
                clicked_item = item;
            }
        }
        
        ImageView detail_image = findViewById(R.id.detail_image);
        TextView detail_title = findViewById(R.id.detail_title);
        TextView detail_description = findViewById(R.id.detail_description);
        TextView detail_price = findViewById(R.id.detail_price);
        
        detail_image.setImageResource(clicked_item.getImageID());
        detail_title.setText(clicked_item.getName());
        detail_description.setText(clicked_item.getDescription());
        detail_price.setText("$" + clicked_item.getPrice());
        
        EditText detail_quantity = findViewById(R.id.detail_quantity);
        
        add_btn = findViewById(R.id.add_btn);
        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                int quantity = 0;
                //check if quantity is empty
                if(!detail_quantity.getText().toString().equals("")) {
                    
                    
                    //get quantity
                    quantity = Integer.parseInt(detail_quantity.getText().toString());
                    // calculate total and pass to foodlist total
                    Intent return_total = new Intent(getApplicationContext(), FoodListActivity.class);
//                    return_total.putExtra("total", quantity * clicked_item.getPrice());
                    return_total.putExtra("category", clicked_item.getCategory());
                    
                    // add item to shopping cart
//                    Order order = new Order(clicked_item.getCategory(), clicked_item.getName(), clicked_item.getDescription(), clicked_item.getPrice(), clicked_item.getImageID(), quantity);
                    ShoppingCart.ordered_items[clicked_item.getItemID()] += quantity;
                    ShoppingCart.total += quantity * clicked_item.getPrice();
                    Toast.makeText(getApplicationContext(), "Item added", Toast.LENGTH_LONG).show();
                    
                    //start foodlist activity
                    
                    startActivity(return_total);
                    
                }
                
                
            }
        });
    }
    
}