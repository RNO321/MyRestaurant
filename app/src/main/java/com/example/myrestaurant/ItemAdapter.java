package com.example.myrestaurant;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends BaseAdapter {
    Context context;
    ArrayList<Item> items;

    public ItemAdapter (Context context, ArrayList<Item> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount () {
        return items.size();
    }

    @Override
    public Object getItem (int position) {
        return items.get(position);
    }

    @Override
    public long getItemId (int position) {
        return position;
    }

    @Override
    public View getView (int position, View view, ViewGroup viewGroup) {
        View v = View.inflate(context, R.layout.food_list_item, null);
        TextView item_name = v.findViewById(R.id.food_list_name);
        item_name.setText(items.get(position).getName());

        return v;
    }
}

