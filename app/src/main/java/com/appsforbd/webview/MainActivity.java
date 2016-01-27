package com.appsforbd.webview;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.appsforbd.webview.adapter.AdapterFragmentTab;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout)findViewById(R.id.tabViewPager);
        viewPager = (ViewPager)findViewById(R.id.pager);

        viewPager.setAdapter(new AdapterFragmentTab(getSupportFragmentManager()));
        //set tab ViewPager
        tabLayout.setupWithViewPager(viewPager);

    }
}