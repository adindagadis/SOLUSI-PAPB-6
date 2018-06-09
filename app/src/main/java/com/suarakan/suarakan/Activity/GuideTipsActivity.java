package com.suarakan.suarakan.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.suarakan.suarakan.Adapter.FragmentGuideTipsAdapter;
import com.suarakan.suarakan.R;

public class GuideTipsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ViewPager viewPager = findViewById(R.id.view_pager);
        FragmentGuideTipsAdapter fragmentAdapter = new FragmentGuideTipsAdapter(
                getSupportFragmentManager());
        viewPager.setAdapter(fragmentAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
