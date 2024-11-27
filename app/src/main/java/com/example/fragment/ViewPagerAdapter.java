package com.example.fragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm, int behavior) {
        super(fm, behavior);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AboutFragment();
            case 1:
                return new ReviewFragment();
            case 2:
                return new AuthorFragment();
            case 3:
                return new LoginFragment();
            case 4:
                return  new SearchFragment();
            default:
                return new AboutFragment();
        }
    }
    @Override
    public int getCount() {
        return 5;
    }
}

