package com.example.preparacaoteste;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class testeDAO {
    private SQLiteDatabase db;

    private DbHelper dbHelper;

    private ArrayList<teste> testeArrayList;
    private teste teste;

    public testeDAO(Context context){
        dbHelper = new DbHelper(context);
        db = dbHelper.getWritableDatabase();
    }

    public void inserir(int Um, int Dois, int verificacao) {

        ContentValues contentValues = new ContentValues();

        contentValues.put("numeroUm", Um);
        contentValues.put("numeroDois", Dois);
        contentValues.put("verificacao", verificacao);

        db.insert("numeros", null, contentValues);

    }
        @SuppressLint("Range")
        public ArrayList<teste> getTeste(){
        String strSQL = "Select * from numeros";

        SQLiteDatabase db = dbHelper.getWritableDatabase();
            Cursor c = db.rawQuery(strSQL, null);

            if(c.moveToFirst())
            {
                do {
                   teste = new teste();
                   teste.setNumeroUm(c.getString(c.getColumnIndex("numeroUm")));
                   teste.setNumeroDois(c.getString(c.getColumnIndex("numeroDois")));
                   teste.setVerificacao(c.getString(c.getColumnIndex("verificacao")));

                   testeArrayList.add(teste);
                }while (c.moveToNext());
            }
            return testeArrayList;
        }

        
}
