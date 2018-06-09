package com.suarakan.suarakan.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.suarakan.suarakan.CaraFragment;
import com.suarakan.suarakan.Fragment.GuideFragment;
import com.suarakan.suarakan.Fragment.TipsFragment;

public class FragmentGuideTipsAdapter extends FragmentPagerAdapter {

    public FragmentGuideTipsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return GuideFragment.newInstance();
        } else if (position == 1) {
            return TipsFragment.newInstance();
        } else {
            return CaraFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Petunjuk";
            case 1:
                return "Tips";
            case 2:
                return "Cara";
            default:
                return null;
        }
    }
}
