package com.rbrazuk.ross.tabletop_tracker.Activities;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

import com.rbrazuk.ross.tabletop_tracker.Fragments.HomeFragment;
import com.rbrazuk.ross.tabletop_tracker.Fragments.MyGamesFragment;
import com.rbrazuk.ross.tabletop_tracker.Fragments.PlaysFragment;
import com.rbrazuk.ross.tabletop_tracker.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {
    FragmentPagerAdapter adapterViewPager;

    @BindView(R.id.vp_viewpager) ViewPager mViewPager;
    @BindView(R.id.tl_tablayout) TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(adapterViewPager);

        mTabLayout.setupWithViewPager(mViewPager);
    }

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 3;
        private String[] tabTitles = new String[] {"Home", "Plays", "My Games"};

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return HomeFragment.newInstance();
                case 1:
                    return PlaysFragment.newInstance();
                case 2:
                    return MyGamesFragment.newInstance();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitles[position];
        }
    }




}
