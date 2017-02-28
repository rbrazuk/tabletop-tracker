package com.rbrazuk.ross.tabletop_tracker.Activities;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.widget.Toast;

import com.rbrazuk.ross.tabletop_tracker.Fragments.HomeFragment;
import com.rbrazuk.ross.tabletop_tracker.Fragments.MyGamesFragment;
import com.rbrazuk.ross.tabletop_tracker.Fragments.PlaysFragment;
import com.rbrazuk.ross.tabletop_tracker.Models.Game;
import com.rbrazuk.ross.tabletop_tracker.Models.Play;
import com.rbrazuk.ross.tabletop_tracker.Models.Player;
import com.rbrazuk.ross.tabletop_tracker.R;
import com.rbrazuk.ross.tabletop_tracker.Services.SqlService;
import com.rbrazuk.ross.tabletop_tracker.Utils;

import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

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



        List<Player> players = new ArrayList<>(Arrays.asList(new Player[]{new Player("Ross"),
                new Player("Erin"),
                new Player("Tim"),
                new Player("Christine")}));

        Game game = new Game("Pandemic");

        SqlService.savePlay(players, game, new LocalDate(2017, 2, 24));



        //Play play = new Play(new Game("Pandemic", null), new LocalDate(2017, 2, 24), new String[] {"Ross", "Erin", "Tim", "Christine"});

        //play.save();

//        Play retrievedPlay = Play.findById(Play.class, 1);
//
//        if (Play.findById(Play.class, 55) == null) {
//            System.out.println("Shit is null");
//        }
//
//        System.out.println(retrievedPlay.toString());


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

    public void savePlay(Game game, List<Player> players) {
        for (Player player : players) {
            player.save();
        }
    }


}
