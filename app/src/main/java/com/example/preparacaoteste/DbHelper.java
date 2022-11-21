package com.example.preparacaoteste;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "bd_numero";
    public static final String TABLE_FICHA = "ficha";
    private static final int DATABASE_VERSION = 1;

    public static final String tableteste = "create table numeros"
            +"( id integer primary key autoincrement,"
            + "numeroUm integer not null,"
            + "numeroDois integer not null,"
            + "verificacao integer not null)";

    public DbHelper (Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(tableteste);
        Log.i("bd", "bd criada com sucesso");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("Drop table if exists" + tableteste);
        onCreate(db);
    }
}
