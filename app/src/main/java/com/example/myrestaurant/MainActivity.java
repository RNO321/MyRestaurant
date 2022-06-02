package com.example.myrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.main);

        listView.setAdapter(new MenuAdapter(this, Database.categories));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), FoodListActivity.class);
                intent.putExtra("category", Database.categories.get(position).getCategory());
                startActivity(intent);
            }
        });
    }
}