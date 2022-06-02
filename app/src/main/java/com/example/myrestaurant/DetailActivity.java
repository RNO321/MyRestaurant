package com.example.myrestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    String name;
    Item clicked_item;
    Button add_btn;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        if (intent != null) {
            name = intent.getStringExtra("item_name");
        }

        for (Item item :
                Database.items) {
            if (item.getName().equals(name)) {
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
            public void onClick (View v) {
                double quantity = Double.parseDouble(detail_quantity.getText().toString());

            }
        });
    }
}