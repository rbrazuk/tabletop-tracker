package com.rbrazuk.ross.tabletop_tracker.Models;

import com.orm.SugarRecord;

import java.util.List;

public class Game {

    private String mTitle;
    private List<Play> mPlays;

    public Game(String title) {
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public List<Play> getPlays() {
        return mPlays;
    }

    public void setPlays(List<Play> plays) {
        mPlays = plays;
    }
}
