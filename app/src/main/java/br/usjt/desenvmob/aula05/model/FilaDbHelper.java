package br.usjt.desenvmob.aula03.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static br.usjt.desenvmob.aula03.model.FilaDbContract.FilaDb;

/**
 * Created by roger.oliveira-816117932
 */

public class FilaDbHelper extends SQLiteOpenHelper{
    public static final String SQL_CREATE_FILA =
            "CREATE TABLE " + FilaDbContract.FilaDb.TABLE_NAME + " ( " +
                    FilaDbContract.FilaDb._ID + " INTEGER PRIMARY KEY, " +
                    FilaDbContract.FilaDb.ID_FILA + " INTEGER, " +
                    FilaDbContract.FilaDb.NM_FILA + " TEXT, " +
                    FilaDbContract.FilaDb.NM_FIGURA + " TEXT, " +
                    FilaDbContract.FilaDb.IMG_FIGURA + " BLOB ) ";

    public static final String SQL_DROP_FILA = "DROP TABLE IF EXISTS " + FilaDbContract.FilaDb.TABLE_NAME;

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_FILA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DROP_FILA);
        db.execSQL(SQL_CREATE_FILA);
    }

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Fila.db";

    public FilaDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
