package br.grupointegrado.jucemard.todoproject.bd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Jucemar Dias on 29/03/2017.
 */

public class DataBase extends SQLiteOpenHelper {

    

    public DataBase (Context context){
        super(context, null,null, null);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
