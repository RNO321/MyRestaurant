package com.example.myrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FoodListActivity extends AppCompatActivity {
    String category;
    ListView listView;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);

        Intent intent = getIntent();
        if (intent != null) {
            category = intent.getStringExtra("category");
        }

        listView = findViewById(R.id.food_list);

        ArrayList<Item> food_list_items = new ArrayList<>();
        for (Item item :
                Database.items) {
            if (item.getCategory().equals(category)) {
                food_list_items.add(item);
            }

        }
        listView.setAdapter(new ItemAdapter(this, food_list_items));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("item_name", food_list_items.get(position).getName());
                startActivity(intent);
            }
        });

    }
}