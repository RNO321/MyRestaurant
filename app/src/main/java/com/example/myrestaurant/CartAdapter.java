package com.example.myrestaurant;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CartAdapter extends BaseAdapter {
    
    Context context;
    ArrayList<Order> cartOrders;
    
    public CartAdapter(Context context, ArrayList<Order> cartOrders) {
        
        this.context = context;
        this.cartOrders = cartOrders;
    }
    
    @Override
    public int getCount() {
        
        return cartOrders.size();
    }
    
    @Override
    public Object getItem(int position) {
        
        return cartOrders.get(position);
    }
    
    @Override
    public long getItemId(int position) {
        
        return position;
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        
        View v = View.inflate(context, R.layout.cart_item, null);
        TextView cartName = v.findViewById(R.id.cart_name);
        cartName.setText(cartOrders.get(position).getItem().getName());
        TextView cartQuantity = v.findViewById(R.id.cart_quantity);
        cartQuantity.setText("" + cartOrders.get(position).getQuantity());
        TextView cartPrice = v.findViewById(R.id.cart_price);
        cartPrice.setText(String.format("$%.2f", cartOrders.get(position).getItem().getPrice()));
        TextView cartItemTotal = v.findViewById(R.id.cart_item_total);
        cartItemTotal.setText(String.format("$%.2f", cartOrders.get(position).getQuantity() * cartOrders.get(position).getItem().getPrice()))
        ;
        
        return v;
    }
    
}
