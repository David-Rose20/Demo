package com.example.company.collabexample.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.company.collabexample.models.Item;

import com.example.company.collabexample.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    // TODO This is Fragment 1 which will go in the first tab


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

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("David", "david@david.com"));
        items.add(new Item("Chris", "chris@chris.com"));


        TextView textView = new TextView(getActivity());
        textView.setText(R.string.hello_blank_fragment);
        // Name TextView id is "place_name"
        // Email TextView id is "place_email"
        return textView;
    }

}
