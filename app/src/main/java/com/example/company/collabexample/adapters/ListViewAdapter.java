package com.example.company.collabexample.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.company.collabexample.R;
import com.example.company.collabexample.models.Item;

import java.util.ArrayList;

public class ListViewAdapter extends ArrayAdapter<Item>{
    // Create ListView Adapter

    // Create ViewHolder
    static class ViewHolder {
        TextView name;
        TextView email;
    }

    public ListViewAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        // Inflate listItemView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_items
                    , parent
                    , false);
        }
        // Get current item via index
        Item currentItem = getItem(position);

        // Set the data to view
        ViewHolder holder = new ViewHolder();
        holder.name = listItemView.findViewById(R.id.place_name);
        holder.name.setText(currentItem.getName());
        holder.email = listItemView.findViewById(R.id.place_email);
        holder.email.setText(currentItem.getEmail());

        // Return view
        return listItemView;
    }
}