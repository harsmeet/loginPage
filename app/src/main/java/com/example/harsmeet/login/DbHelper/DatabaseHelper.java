package com.example.harsmeet.login.DbHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hars on 31-07-2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "signup.db";
    private static final String TABLE_NAME = "contacts";

    private static final String COLUMN_ID = "id";

    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_PASS = "pass";
    SQLiteDatabase db;


    private String TABLE_CREATE = "CREATE TABLE " + TABLE_NAME + "("
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COLUMN_EMAIL + " TEXT,"  + COLUMN_PASS + " TEXT " + ")";


    /**
     * Constructor
     *
     * @param context
     */
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(TABLE_CREATE);
        this.db = db;
    }

    public void insertContact(SignUpDB c) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COLUMN_EMAIL, c.getEmail());
        values.put(COLUMN_PASS, c.getpass());
        db.insert(TABLE_NAME, null, values);

        db.close();
    }

    public boolean checkUser(String emailStr, String passwdStr) {
        String[] columns =
                {
                        COLUMN_ID
                };
        db = this.getReadableDatabase();
        String selection = COLUMN_EMAIL + " = ? " + " AND " + COLUMN_PASS + " = ? ";
        String[] selectArgs = {emailStr, passwdStr};
        Cursor cursor = db.query(TABLE_NAME, columns, selection, selectArgs, null, null, null);
        int cursorcount = cursor.getCount();
        if (cursorcount > 0) {
            return true;
        }
        return false;

    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //Drop User Table if exist
        //  db.execSQL(DROP_USER_TABLE1);
        // db.execSQL(DROP_USER_TABLE2);

        // Create tables again
        onCreate(db);

    }




}

