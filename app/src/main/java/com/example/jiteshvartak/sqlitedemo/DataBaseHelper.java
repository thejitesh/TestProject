package com.example.jiteshvartak.sqlitedemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jiteshvartak on 6/22/17.
 */

public class DataBaseHelper {








    static class MyDataBaseHelper extends SQLiteOpenHelper{


        public MyDataBaseHelper(Context context, String dbName, SQLiteDatabase.CursorFactory factory , int dbVersion){
            super(context,dbName,factory,dbVersion);
        }


        @Override
        public void onCreate(SQLiteDatabase db) {

        }


        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }

        @Override
        public void onConfigure(SQLiteDatabase db) {
            super.onConfigure(db);
        }
    }
}
