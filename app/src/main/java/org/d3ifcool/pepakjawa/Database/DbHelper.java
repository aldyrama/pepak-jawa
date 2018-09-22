package org.d3ifcool.pepakjawa.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import org.d3ifcool.pepakjawa.Database.Contract.ParamasastraEntry;
import org.d3ifcool.pepakjawa.Database.Contract.RupaKawruhEntry;
import org.d3ifcool.pepakjawa.Database.Contract.KawruhBasaEntry;
import org.d3ifcool.pepakjawa.Database.Contract.KesusastraanEntry;
import org.d3ifcool.pepakjawa.Database.Contract.AksaraJawaEntry;
import org.d3ifcool.pepakjawa.Database.Contract.WayangPurwaEntry;

public class DbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "pepak.db";
    private static final int DATABASE_VERSION = 1;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_PARAMASASTRA_TABLE = "CREATE TABLE " + ParamasastraEntry.TABLE_NAME + " ("
                + ParamasastraEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + ParamasastraEntry.COLUMN_JAWA + " TEXT NOT NULL, "
                + ParamasastraEntry.COLUMN_TRANSLATE + " TEXT NOT NULL);";
        String SQL_CREATE_RUPAKAWRUH_TABLE = "CREATE TABLE " + RupaKawruhEntry.TABLE_NAME + " ("
                + RupaKawruhEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + RupaKawruhEntry.COLUMN_JAWA + " TEXT NOT NULL, "
                + RupaKawruhEntry.COLUMN_TRANSLATE + " TEXT NOT NULL);";
        String SQL_CREATE_KAWRUHBASA_TABLE = "CREATE TABLE " + KawruhBasaEntry.TABLE_NAME + " ("
                + RupaKawruhEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + RupaKawruhEntry.COLUMN_JAWA + " TEXT NOT NULL, "
                + RupaKawruhEntry.COLUMN_TRANSLATE + " TEXT NOT NULL);";
        String SQL_CREATE_KESUSASTRAAN_TABLE = "CREATE TABLE " + KesusastraanEntry.TABLE_NAME + " ("
                + KesusastraanEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + KesusastraanEntry.COLUMN_JAWA + " TEXT NOT NULL, "
                + KesusastraanEntry.COLUMN_TRANSLATE + " TEXT NOT NULL);";
        String SQL_CREATE_AKSARAJAWA_TABLE = "CREATE TABLE " + AksaraJawaEntry.TABLE_NAME + " ("
                + AksaraJawaEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + AksaraJawaEntry.COLUMN_JAWA + " TEXT NOT NULL, "
                + AksaraJawaEntry.COLUMN_TRANSLATE + " TEXT NOT NULL);";
        String SQL_CREATE_WAYANGPURWA_TABLE = "CREATE TABLE " + WayangPurwaEntry.TABLE_NAME + " ("
                + WayangPurwaEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + WayangPurwaEntry.COLUMN_JAWA + " TEXT NOT NULL, "
                + WayangPurwaEntry.COLUMN_TRANSLATE + " TEXT NOT NULL);";

        db.execSQL(SQL_CREATE_PARAMASASTRA_TABLE);
        db.execSQL(SQL_CREATE_RUPAKAWRUH_TABLE);
        db.execSQL(SQL_CREATE_KAWRUHBASA_TABLE);
        db.execSQL(SQL_CREATE_KESUSASTRAAN_TABLE);
        db.execSQL(SQL_CREATE_AKSARAJAWA_TABLE);
        db.execSQL(SQL_CREATE_WAYANGPURWA_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
