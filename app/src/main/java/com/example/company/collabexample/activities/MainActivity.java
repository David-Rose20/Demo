package com.example.company.collabexample.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import com.example.company.collabexample.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO setup ViewPager & setupWithViewPager
        ViewPager viewPager = findViewById(R.id.view_pager);

    }
}
