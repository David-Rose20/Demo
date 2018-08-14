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
    // TODO create ListView Adapter
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

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view
                    , parent
                    , false);
        }

        Item currentItem = getItem(position);

        ViewHolder holder = new ViewHolder();
        holder.name = listItemView.findViewById(R.id.place_name);
        holder.email = listItemView.findViewById(R.id.place_email);

        return listItemView;
    }
}