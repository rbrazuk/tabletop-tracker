package com.rbrazuk.ross.tabletop_tracker.Models;

import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

public class Player extends SugarRecord {

    private String mName;
    private List<Play> mPlays;

    public Player() {}

    public Player(String name) {
        mName = name;
        mPlays = new ArrayList<>();
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public List<Play> getPlays() {
        return mPlays;
    }

    public void setPlays(List<Play> plays) {
        mPlays = plays;
    }

    public void addPlay(Play play) {
        mPlays.add(play);
    }
}
