package com.appsforbd.webview.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.appsforbd.webview.fragment.Home;
import com.appsforbd.webview.fragment.About;

/**
 * Developed by Sobuj on 25/01/2016.
 */

public class AdapterFragmentTab extends FragmentPagerAdapter {

    String[] title = new String[]{"Home", "About us"};

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    public AdapterFragmentTab(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment tab = null;
        switch (position) {
            case 0:
                tab = new Home();
                break;
            case 1:
                tab = new About();
                break;
        }
        return tab;
    }

    @Override
    public int getCount() {
        return 2;
    }

}
