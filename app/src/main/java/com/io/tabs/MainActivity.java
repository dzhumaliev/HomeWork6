package com.io.tabs;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.io.tabs.first.FirstFragment;
import com.io.tabs.second.SecondFragment;
import com.io.tabs.third.ThirdFragment;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabs);
        viewPager2 = findViewById(R.id.container);


        setupViewPager(viewPager2);
        tabLayout.setupWithViewPager(viewPager2);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment(), "Exchange");
        adapter.addFragment(new SecondFragment(), "Date & Time");
        adapter.addFragment(new ThirdFragment(), "More");
        viewPager.setAdapter(adapter);
    }

}