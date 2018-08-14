package com.example.company.collabexample.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.company.collabexample.adapters.ListViewAdapter;
import com.example.company.collabexample.models.Item;

import com.example.company.collabexample.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    // This is Fragment 1 which will go in the first tab

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflat layout view
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Add data to Item list
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("David", "david@david.com"));
        items.add(new Item("Chris", "chris@chris.com"));

        // Attach ListView adapter
        final ListViewAdapter adapter = new ListViewAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        // Return the view
        return listView;
    }

}
