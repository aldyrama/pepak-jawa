package org.d3ifcool.pepakjawa.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseConnect {

    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseConnect instance;

    //Private Constructor to avoid object creation from outside classes

    private DatabaseConnect(Context context){
        this.openHelper = new DatabaseHelper(context);
    }

    //return a singleton instance of databases Access
    public static DatabaseConnect getInstance(Context context){
        if(instance == null){
            instance = new DatabaseConnect(context);
        }
        return instance;
    }

    //Open databases Connection
    public void open(){
        this.database = openHelper.getWritableDatabase();
    }

    public void close(){
        if(database != null){
            this.database.close();
        }
    }

    public List<String> getKamusJawa(){
        List<String> list = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT * FROM kamusjawaindonesia", null);
        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            list.add(cursor.getString(1));
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }

    public List<String> getKamusIndonesia(){
        List<String> list = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT * FROM kamusjawaindonesia ORDER BY indonesia ASC", null);
        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            list.add(cursor.getString(2));
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }

    public List<String> getSearchJawa(String keyword){
        List<String> list = new ArrayList<>();
        String queryString = "SELECT * FROM KamusJawaIndonesia WHERE jawa LIKE '%" + keyword +"%' ORDER BY jawa ASC";
        Cursor cursor = database.rawQuery(queryString, null);
        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            list.add(cursor.getString(1));
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }

    public List<String> getSearchIndonesia(String keyword){
        List<String> list = new ArrayList<>();
        String queryString = "SELECT * FROM KamusJawaIndonesia WHERE indonesia LIKE '%" + keyword +"%' ORDER BY indonesia ASC";
        Cursor cursor = database.rawQuery(queryString, null);
        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            list.add(cursor.getString(2));
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }

    public String getSelectedJawa(String kataJawa){
        String queryString = "SELECT * FROM kamusjawaindonesia WHERE jawa='"+ kataJawa +"'";
        Cursor cursor = database.rawQuery(queryString, null);
        cursor.moveToFirst();
        String arti = cursor.getString(2);
        cursor.close();
        return arti;
    }

    public String getSelectedIndonesia(String kataIndonesia){
        String queryString = "SELECT * FROM kamusjawaindonesia WHERE indonesia='"+ kataIndonesia +"'";
        Cursor cursor = database.rawQuery(queryString, null);
        cursor.moveToFirst();
        String arti = cursor.getString(1);
        cursor.close();
        return arti;
    }

}
