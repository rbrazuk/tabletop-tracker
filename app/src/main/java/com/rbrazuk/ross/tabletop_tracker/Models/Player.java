package com.rbrazuk.ross.tabletop_tracker.Models;

public class Player {

    private String mName;


    public Player(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
