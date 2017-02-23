package com.rbrazuk.ross.tabletop_tracker.Models;

import com.rbrazuk.ross.tabletop_tracker.Models.Game;

import java.util.Date;

public class Play {

    private Game mGame;
    private Date mDate;
    private String[] mPlayers;

    public Play() {}

    public Play(Game game, Date date, String[] players) {
        mGame = game;
        mDate = date;
        mPlayers = players;
    }

    public Game getGame() {
        return mGame;
    }

    public void setGame(Game game) {
        mGame = game;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String[] getPlayers() {
        return mPlayers;
    }

    public void setPlayers(String[] players) {
        mPlayers = players;
    }
}
