package com.shpcode.fanbox.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

import com.shpcode.fanbox.activity.fragment.MainFragment;

/**
 * Created by Administrator on 2016/10/14.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        return new MainFragment();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        //return super.getPageTitle(position);
        return "dsd";
    }


}
