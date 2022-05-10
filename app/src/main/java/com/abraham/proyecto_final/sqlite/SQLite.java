package com.abraham.proyecto_final.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLite extends SQLiteOpenHelper{

    private static final String database = "pedidos.db";
    private static final int VERSION = 1;
    private final String tPedidos = "CREATE TABLE PEDIDOS(" +
            "ID INT PRIMARY KEY AUTOINCREMENT NOT NULL," +
            ")";


    public SQLite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
