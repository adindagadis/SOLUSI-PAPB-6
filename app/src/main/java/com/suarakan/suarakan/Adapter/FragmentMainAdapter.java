package com.suarakan.suarakan.Adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.suarakan.suarakan.Fragment.OverviewFragment;

public class FragmentMainAdapter extends FragmentPagerAdapter {

    private Context context;

    public FragmentMainAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
            return OverviewFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "";
            default:
                return null;
        }
    }
}
