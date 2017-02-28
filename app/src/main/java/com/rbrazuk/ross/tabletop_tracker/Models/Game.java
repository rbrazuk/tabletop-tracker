package com.rbrazuk.ross.tabletop_tracker.Models;

import com.orm.SugarRecord;

import java.util.List;

public class Game extends SugarRecord {

    private String mTitle;


    public Game() {
    }

    public Game(String title) {
        mTitle = title;

    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    @Override
    public String toString() {
        return this.getTitle();
    }
}
