package com.example.company.collabexample.adapters;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    // TODO create Pager Adapter for the two tabs

    private Context thisContext;
    private int currnetPosition = -1;

    public ViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        thisContext = context;
    }

    @Override
    public long getItemId(int position) {
        if (position == 0) {
            currnetPosition = 0;
            return new Fragment1();
        }

        if (position == 1) {
            currnetPosition = 1;
            return;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }


}

