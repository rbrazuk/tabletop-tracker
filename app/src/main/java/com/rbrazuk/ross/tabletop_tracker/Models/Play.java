package com.rbrazuk.ross.tabletop_tracker.Models;

import java.util.List;

public class Play {

    private Game mGame;
    private String mPlayDate;
    private List<Player> mPlayers;

    public Play(Game game, String playDate) {
        mGame = game;
        mPlayDate = playDate;
    }

    public Game getGame() {
        return mGame;
    }

    public void setGame(Game game) {
        mGame = game;
    }

    public String getPlayDate() {
        return mPlayDate;
    }

    public void setPlayDate(String playDate) {
        mPlayDate = playDate;
    }

    public List<Player> getPlayers() {
        return mPlayers;
    }

    public void setPlayers(List<Player> players) {
        mPlayers = players;
    }
}
