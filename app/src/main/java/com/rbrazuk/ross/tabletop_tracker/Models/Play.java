package com.rbrazuk.ross.tabletop_tracker.Models;

import com.orm.SugarRecord;
import com.orm.dsl.Ignore;
import com.rbrazuk.ross.tabletop_tracker.Models.Game;

import org.joda.time.LocalDate;

import java.util.Date;
import java.util.List;

public class Play {

    private Game mGame;
    private String mPlayDate;

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
}
