package com.example.company.collabexample.fragments;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.company.collabexample.R;
import com.example.company.collabexample.adapters.ListViewAdapter;
import com.example.company.collabexample.models.Item;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment3 extends Fragment {

    // This is Fragment 3 which will go in the first tab
    public Fragment3() {
        // Required empty public constructor
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("..........", ".........."));
        items.add(new Item("----------", "----------"));

        // Hide FAB button when needed
        FloatingActionButton fab = rootView.findViewById(R.id.fab);
        fab.hide();

        final ListViewAdapter adapter = new ListViewAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        return rootView;
    }

}
