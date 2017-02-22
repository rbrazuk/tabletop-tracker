package com.rbrazuk.ross.tabletop_tracker.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rbrazuk.ross.tabletop_tracker.R;

/**
 * Created by Ross on 2/22/2017.
 */

public class MyGamesFragment extends Fragment {

    public static final String PAGE_NUMBER_KEY = "pageNumber";
    public static final int PAGE_NUMBER = 2;
    public static final String PAGE_TITLE_KEY = "pageTitle";
    public static final String PAGE_TITLE = "My Games";

    private String title;
    private int pageNumber;

    public static MyGamesFragment newInstance() {
        MyGamesFragment gamesFragment = new MyGamesFragment();
        Bundle args = new Bundle();
        args.putInt(PAGE_NUMBER_KEY, PAGE_NUMBER);
        args.putString(PAGE_TITLE_KEY, PAGE_TITLE);
        gamesFragment.setArguments(args);

        return gamesFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        title = getArguments().getString(PAGE_TITLE_KEY);
        pageNumber = getArguments().getInt(PAGE_NUMBER_KEY);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_games, container, false);
        return view;
    }
}
