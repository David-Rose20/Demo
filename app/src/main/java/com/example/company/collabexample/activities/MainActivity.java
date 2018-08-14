package com.example.company.collabexample.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import com.example.company.collabexample.R;
import com.example.company.collabexample.adapters.ViewPagerAdapter;
import android.support.design.widget.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup ViewPager & setupWithViewPager
        ViewPager viewPager = findViewById(R.id.view_pager);
        getSupportActionBar().setElevation(0);

        // Create view adapter
        ViewPagerAdapter adapter = new ViewPagerAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        // Setup Tab layout
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

    }
}
