package com.example.asdzx.weatherand2;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {
    private final int NUM_ITEMS = 6;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public int getCount() {
        return NUM_ITEMS;
    }

    public Fragment getItem(int position) {
        if (position == 0)
            return LayoutOne.newInstance();
        else if (position == 5)
            return LayoutTwo.newInstance();
        else if (position == 1)
            return LayoutThree.newInstance();
        else if (position == 2)
            return LayoutFour.newInstance();
        else if (position == 3)
            return LayoutFive.newInstance();
        else if (position == 4)
            return LayoutSix.newInstance();
        return null;
    }
}