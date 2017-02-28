package com.rbrazuk.ross.tabletop_tracker.Models;

import com.orm.SugarRecord;

import java.util.List;

public class Game {

    private String mTitle;

    public Game(String title) {
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
