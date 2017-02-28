package com.rbrazuk.ross.tabletop_tracker.Services;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseService extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "playsDatabase";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_PLAYS = "plays";
    private static final String TABLE_GAMES = "games";
    private static final String TABLE_PLAYERS = "players";

    // Play Table Columns
    private static final String KEY_PLAY_ID = "id";
    private static final String KEY_PLAY_GAME_ID_FK = "gameId";
    private static final String KEY_PLAY_DATE = "playDate";
    private static final String KEY_PLAYER_COUNT = "playerCount";

    // Game Table Columns
    private static final String KEY_GAME_TITLE = "gameTitle";

    // Player Table Columns
    private static final String KEY_PLAYER_NAME = "playerName";


    // GamePlayer Junction Table Columns

    // PlayPlayer Junction Table Columns

    public DatabaseService(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
