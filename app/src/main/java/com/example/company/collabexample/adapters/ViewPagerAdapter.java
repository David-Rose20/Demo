package com.example.company.collabexample.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.company.collabexample.fragments.Fragment1;
import com.example.company.collabexample.fragments.Fragment2;
import com.example.company.collabexample.fragments.Fragment3;

// Create FragmentPagerAdapter
public class ViewPagerAdapter extends FragmentPagerAdapter {

    // Create Pager Adapter for the two tabs

    // Init vars
    private Context thisContext;
    private int currnetPosition = -1;

    // Setup constructor
    public ViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        thisContext = context;
    }

    // Setup 2 fragments via id
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            currnetPosition = 0;
            return new Fragment1();
        } else if (position == 1){
            currnetPosition = 1;
            return new Fragment2();
        } else {
            currnetPosition = 2;
            return new Fragment3();
        }
    }
    // Setup total fragment counts
    @Override
    public int getCount() {
        return 3;
    }

    // Setpu fragment title
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Fragment 1";
        } else if (position == 1) {
            return "Fragment 2";
        } else if (position == 2) {
            return "Fragment 3";
        } else {
            return "";
        }
    }
}

