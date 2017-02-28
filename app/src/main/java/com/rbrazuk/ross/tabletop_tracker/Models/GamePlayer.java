package com.rbrazuk.ross.tabletop_tracker.Models;

public class GamePlayer {

    private int mGameId;
    private int mPlayerId;

    public GamePlayer(int gameId, int playerId) {
        mGameId = gameId;
        mPlayerId = playerId;
    }

    public int getGameId() {
        return mGameId;
    }

    public void setGameId(int gameId) {
        mGameId = gameId;
    }

    public int getPlayerId() {
        return mPlayerId;
    }

    public void setPlayerId(int playerId) {
        mPlayerId = playerId;
    }
}
