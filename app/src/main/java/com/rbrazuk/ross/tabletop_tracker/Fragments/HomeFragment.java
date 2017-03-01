package com.rbrazuk.ross.tabletop_tracker.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.rbrazuk.ross.tabletop_tracker.DataBaseHelper;
import com.rbrazuk.ross.tabletop_tracker.Models.Game;
import com.rbrazuk.ross.tabletop_tracker.Models.Play;
import com.rbrazuk.ross.tabletop_tracker.Models.Player;
import com.rbrazuk.ross.tabletop_tracker.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeFragment extends Fragment {

    public static final String PAGE_NUMBER_KEY = "pageNumber";
    public static final int PAGE_NUMBER = 0;
    public static final String PAGE_TITLE_KEY = "pageTitle";
    public static final String PAGE_TITLE = "Home";

    private String title;
    private int pageNumber;

    @BindView(R.id.ll_recent_plays_container) LinearLayout mPlaysContainer;

    public static HomeFragment newInstance() {
        HomeFragment homeFragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putInt(PAGE_NUMBER_KEY, PAGE_NUMBER);
        args.putString(PAGE_TITLE_KEY, PAGE_TITLE);
        homeFragment.setArguments(args);

        return homeFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        title = getArguments().getString(PAGE_TITLE_KEY);
        pageNumber = getArguments().getInt(PAGE_NUMBER_KEY);

        DataBaseHelper helper = DataBaseHelper.getInstance(getContext());

//        Game gloom = new Game("Gloom");
//        Game hanabi = new Game("Hanabi");
//        Game elderSign = new Game("Elder Sign");
//        Game arboretum = new Game("Arboretum");
//
//        helper.saveOrUpdateGame(gloom);
//        helper.saveOrUpdateGame(hanabi);
//        helper.saveOrUpdateGame(elderSign);
//        helper.saveOrUpdateGame(arboretum);

        for (Game game: helper.getAllGames()) {
            Log.d("GAME", game.getTitle());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ButterKnife.bind(this, view);

        return view;
    }
}
