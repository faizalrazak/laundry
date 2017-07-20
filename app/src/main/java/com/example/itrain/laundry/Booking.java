package com.example.itrain.laundry;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

import static com.example.itrain.laundry.R.id.tab;

public class Booking extends AppCompatActivity implements ServiceFragment.OnFragmentInteractionistener, ClothesFragment.OnFragmentInteractionistener, ScheduleFragment.OnFragmentInteractionistener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        // Adding Toolbar to Main screen
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        // Setting ViewPager for each Tabs

        // Set Tabs inside Toolbar
        TabLayout tabs = (TabLayout) findViewById(tab);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view);
        tabs.setupWithViewPager(viewPager);

        CustomAdapter adapter = new CustomAdapter(getSupportFragmentManager());
        adapter.addFragment(new ServiceFragment(), "Service");
        adapter.addFragment(new ClothesFragment(), "Clothes");
        adapter.addFragment(new ScheduleFragment(), "Schedule");
        viewPager.setAdapter(adapter);
    }



}

