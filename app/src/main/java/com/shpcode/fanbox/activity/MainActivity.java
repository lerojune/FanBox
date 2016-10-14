package com.shpcode.fanbox.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.shpcode.fanbox.R;
import com.shpcode.fanbox.adapter.MainPagerAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    final String TAG = "MainActivity";
    MainActivity instance = this;

    @Bind(R.id.page)
    ViewPager viewPager;
    @Bind(R.id.tab)
    TabLayout tabLayout;

    MainPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    private void init(){
        adapter = new MainPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.addTab(tabLayout.newTab().setText("得到0"));
        tabLayout.addTab(tabLayout.newTab().setText("得到1"));
        tabLayout.addTab(tabLayout.newTab().setText("得到2"));
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#00000000"));
        tabLayout.setTabTextColors(Color.BLACK, Color.BLUE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
