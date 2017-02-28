package com.rbrazuk.ross.tabletop_tracker.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rbrazuk.ross.tabletop_tracker.Adapters.PlaysAdapter;
import com.rbrazuk.ross.tabletop_tracker.Models.Play;
import com.rbrazuk.ross.tabletop_tracker.R;
import com.rbrazuk.ross.tabletop_tracker.Utils;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PlaysFragment extends Fragment {

    public static final String PAGE_NUMBER_KEY = "pageNumber";
    public static final int PAGE_NUMBER = 1;
    public static final String PAGE_TITLE_KEY = "pageTitle";
    public static final String PAGE_TITLE = "Plays";

    private String title;
    private int pageNumber;
    private ArrayList<Play> mPlays;

    @BindView(R.id.rv_plays) RecyclerView mPlaysRecyclerView;

    public static PlaysFragment newInstance() {
        PlaysFragment playsFragment = new PlaysFragment();
        Bundle args = new Bundle();
        args.putInt(PAGE_NUMBER_KEY, PAGE_NUMBER);
        args.putString(PAGE_TITLE_KEY, PAGE_TITLE);
        playsFragment.setArguments(args);

        return playsFragment;
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
        View view = inflater.inflate(R.layout.fragment_plays, container, false);

        ButterKnife.bind(this, view);

        return view;
    }
}
