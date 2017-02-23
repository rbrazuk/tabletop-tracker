package com.rbrazuk.ross.tabletop_tracker.Models;

import com.rbrazuk.ross.tabletop_tracker.Models.Game;

import org.joda.time.LocalDate;

import java.util.Date;

public class Play {

    private Game mGame;
    private LocalDate mDate;
    private String[] mPlayers;

    public Play() {}

    public Play(Game game, LocalDate date, String[] players) {
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

    public LocalDate getDate() {
        return mDate;
    }

    public void setDate(LocalDate date) {
        mDate = date;
    }

    public String[] getPlayers() {
        return mPlayers;
    }

    public void setPlayers(String[] players) {
        mPlayers = players;
    }

    @Override
    public String toString() {
        return this.getDate().toString() + " - " + this.getGame().toString();
    }
}
