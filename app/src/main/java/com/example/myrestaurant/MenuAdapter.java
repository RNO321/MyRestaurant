package com.example.myrestaurant;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuAdapter extends BaseAdapter {
    Context context;
    ArrayList<Category> categories;

    public MenuAdapter (Context context, ArrayList<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @Override
    public int getCount () {
        return categories.size();
    }

    @Override
    public Object getItem (int position) {
        return categories.get(position);
    }

    @Override
    public long getItemId (int position) {
        return position;
    }

    @Override
    public View getView (int position, View view, ViewGroup viewGroup) {
        View v = View.inflate(context, R.layout.main_item, null);
        TextView main_title = v.findViewById(R.id.main_title);
        ImageView main_image = v.findViewById(R.id.main_image);
        main_title.setText(categories.get(position).getCategory());
        main_image.setImageResource(categories.get(position).getImageID());

        return v;
    }
}

