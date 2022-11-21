package com.example.preparacaoteste;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class testeDAO {
    private SQLiteDatabase db;

    private DbHelper dbHelper;

    private teste teste;

    public testeDAO(Context context){
        dbHelper = new DbHelper(context);
        db = dbHelper.getWritableDatabase();
    }

    public void inserir(int Um, int Dois, int verificacao) {
        db = dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("numeroUm", Um);
        contentValues.put("numeroDois", Dois);
        contentValues.put("verificacao", verificacao);

        db.insert("numeros", null, contentValues);

    }

        @SuppressLint("Range")
        public ArrayList<teste> getTeste(){
        ArrayList<teste> testeArrayList = new ArrayList<>();
        String strSQL = "Select * from numeros";

        SQLiteDatabase db = dbHelper.getReadableDatabase();
            Cursor c = db.rawQuery(strSQL, null);

            if(c.moveToFirst())
            {
                do {
                   teste = new teste();
                   teste.setNumeroUm(c.getInt(c.getColumnIndex("numeroUm")));
                   teste.setNumeroDois(c.getInt(c.getColumnIndex("numeroDois")));
                   teste.setVerificacao(c.getInt(c.getColumnIndex("verificacao")));

                   testeArrayList.add(teste);
                }while (c.moveToNext());
            }
            return testeArrayList;
        }
    }
