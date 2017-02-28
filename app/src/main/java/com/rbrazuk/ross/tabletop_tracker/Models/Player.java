package com.rbrazuk.ross.tabletop_tracker.Models;

import java.util.List;

public class Player {

    private String mName;
    private List<Play> mPlays;
    private List<Game> mGames;


    public Player(String name) {
        mName = name;
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

    public List<Game> getGames() {
        return mGames;
    }

    public void setGames(List<Game> games) {
        mGames = games;
    }
}
