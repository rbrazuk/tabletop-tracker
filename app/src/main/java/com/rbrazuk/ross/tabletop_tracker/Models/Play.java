package com.rbrazuk.ross.tabletop_tracker.Models;

import com.orm.SugarRecord;
import com.orm.dsl.Ignore;
import com.rbrazuk.ross.tabletop_tracker.Models.Game;

import org.joda.time.LocalDate;

import java.util.Date;
import java.util.List;

public class Play extends SugarRecord {

    private Game mGame;

    @Ignore
    private LocalDate mDate;

    private String mDateString;
    private List<Player> mPlayers;
    private int mNumberOfPlayers;

    public Play() {}

    public Play(Game game, LocalDate date, List<Player> players) {
        mGame = game;
        mDate = date;
        mDateString = date.toString();
        mPlayers = players;
        mNumberOfPlayers = players.size();
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

    public String getDateString() {
        return mDateString;
    }

    public void setDateString(String dateString) {
        mDateString = dateString;
    }

    public List<Player> getPlayers() {
        return Player.find(Player.class, String.valueOf(getId()));
    }

    public void setPlayers(List<Player> players) {
        mPlayers = players;
    }

    public int getNumberOfPlayers() {return mNumberOfPlayers;}

    @Override
    public String toString() {
        return this.getDateString() + " - " + this.getGame().toString();
    }
}
