package com.rbrazuk.ross.tabletop_tracker.Models;

import java.util.List;

public class Game {

    private String mTitle;
    private List<Play> mPlays;

    public Game() {
    }

    public Game(String title, List<Play> plays) {
        mTitle = title;
        mPlays = plays;
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

    public int getPlayCount() {
        return mPlays.size();
    }

    @Override
    public String toString() {
        return this.getTitle();
    }
}
