package com.rbrazuk.ross.tabletop_tracker.Models;

public class PlayPlayer {

    private int mPlayId;
    private int mPlayerId;

    public PlayPlayer(int playId, int playerId) {
        mPlayId = playId;
        mPlayerId = playerId;
    }

    public int getPlayerId() {
        return mPlayerId;
    }

    public void setPlayerId(int playerId) {
        mPlayerId = playerId;
    }

    public int getPlayId() {
        return mPlayId;
    }

    public void setPlayId(int playId) {
        mPlayId = playId;
    }
}
