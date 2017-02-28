package com.rbrazuk.ross.tabletop_tracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.support.annotation.RequiresApi;

public class DataBaseHelper extends SQLiteOpenHelper {

    private static DataBaseHelper sInstance;

    private static final String DATABASE_NAME = "playsDatabase";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_PLAYS = "plays";
    private static final String TABLE_GAMES = "games";
    private static final String TABLE_PLAYERS = "players";
    private static final String MAPPING_TABLE_GAME_PLAYERS = "gamePlayers";
    private static final String MAPPING_TABLE_PLAY_PLAYERS = "playPlayers";

    // Play Table Columns
    private static final String KEY_PLAY_ID = "id";
    private static final String KEY_PLAY_GAME_ID_FK = "gameIdFk";
    private static final String KEY_PLAY_DATE = "playDate";
    private static final String KEY_PLAY_PLAYER_COUNT = "playerCount";

    // Game Table Columns
    private static final String KEY_GAME_ID = "gameId";
    private static final String KEY_GAME_TITLE = "gameTitle";

    // Player Table Columns
    private static final String KEY_PLAYER_ID = "playerId";
    private static final String KEY_PLAYER_NAME = "playerName";


    // GamePlayer Mapping Table Columns
    private static final String KEY_GAMEPLAYER_GAME_ID = "gamePlayerGameId";
    private static final String KEY_GAMEPLAYER_PLAYER_ID = "gamePlayerPlayerId";

    // PlayPlayer Mapping Table Columns
    private static final String KEY_PLAY_PLAYER_PLAY_ID = "playPlayerPlayId";
    private static final String KEY_PLAY_PLAYER_PLAYER_ID = "playPlayerPlayerId";

    private DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
        db.setForeignKeyConstraintsEnabled(true);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_PLAYS_TABLE = "CREATE TABLE " + TABLE_PLAYS +
                "(" +
                KEY_PLAY_ID + " INTEGER PRIMARY KEY," +
                KEY_PLAY_GAME_ID_FK + " INTEGER REFERENCES " + TABLE_GAMES + ", " +
                KEY_PLAY_DATE + " TEXT," +
                KEY_PLAY_PLAYER_COUNT + " INTEGER" +
                ")";

        String CREATE_GAMES_TABLE = "CREATE TABLE " + TABLE_GAMES +
                "(" +
                KEY_GAME_ID + " INTEGER PRIMARY KEY," +
                KEY_GAME_TITLE + " TEXT" +
                ")";

        String CREATE_PLAYERS_TABLE = "CREATE TABLE " + TABLE_PLAYERS +
                "(" +
                KEY_PLAYER_ID + " INTEGER PRIMARY KEY," +
                KEY_PLAYER_NAME + " TEXT" +
                ")";

        String CREATE_GAME_PLAYER_MAPPING_TABLE = "CREATE TABLE " + MAPPING_TABLE_GAME_PLAYERS +
                "(" +
                KEY_GAMEPLAYER_GAME_ID + " INTEGER," +
                KEY_GAMEPLAYER_PLAYER_ID + " INTEGER" +
                ")";

        String CREATE_PLAY_PLAYER_MAPPING_TABLE = "CREATE TABLE " + MAPPING_TABLE_PLAY_PLAYERS +
                "(" +
                KEY_PLAY_PLAYER_PLAY_ID + " INTEGER," +
                KEY_PLAY_PLAYER_PLAYER_ID + " INTEGER" +
                ")";

        sqLiteDatabase.execSQL(CREATE_PLAYS_TABLE);
        sqLiteDatabase.execSQL(CREATE_GAMES_TABLE);
        sqLiteDatabase.execSQL(CREATE_PLAYERS_TABLE);
        sqLiteDatabase.execSQL(CREATE_GAME_PLAYER_MAPPING_TABLE);
        sqLiteDatabase.execSQL(CREATE_PLAY_PLAYER_MAPPING_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        if (oldVersion != newVersion) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS" + TABLE_PLAYS);
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS" + TABLE_GAMES);
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS" + TABLE_PLAYERS);
            onCreate(sqLiteDatabase);
        }
    }

    public static synchronized DataBaseHelper getInstance(Context context) {
        if (sInstance == null) {
            sInstance =  new DataBaseHelper(context.getApplicationContext());
        }
        return sInstance;
    }

    public void addPlay() {
        SQLiteDatabase db = getWritableDatabase();
    }
}
