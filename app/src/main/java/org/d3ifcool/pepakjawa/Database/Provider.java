package org.d3ifcool.pepakjawa.Database;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class Provider extends ContentProvider {
    private static final int PARAMASASTRA = 1;
    private static final int PARAMASASTRA_ID = 2;

    private static final int RUPAKAWRUH = 3;
    private static final int RUPAKAWRUH_ID = 4;

    private static final int KAWRUHBASA = 5;
    private static final int KAWRUHBASA_ID = 6;

    private static final int KESUSASTRAAN = 7;
    private static final int KESUSASTRAAN_ID = 8;

    private static final int AKSARAJAWA = 9;
    private static final int AKSARAJAWA_ID = 10;

    private static final int WAYANGPURWA = 11;
    private static final int WAYANGPURWA_ID = 12;

    private static UriMatcher sUriMatcher = new UriMatcher(UriMatcher.NO_MATCH);

    static {
        sUriMatcher.addURI(Contract.CONTENT_AUTHORITY, Contract.PATH_PARAMASASTRA, PARAMASASTRA);
        sUriMatcher.addURI(Contract.CONTENT_AUTHORITY, Contract.PATH_PARAMASASTRA + "/#", PARAMASASTRA_ID);

        sUriMatcher.addURI(Contract.CONTENT_AUTHORITY, Contract.PATH_RUPA_KAWRUH, RUPAKAWRUH);
        sUriMatcher.addURI(Contract.CONTENT_AUTHORITY, Contract.PATH_RUPA_KAWRUH + "/#", RUPAKAWRUH_ID);

        sUriMatcher.addURI(Contract.CONTENT_AUTHORITY, Contract.PATH_KAWRUH_BASA, KAWRUHBASA);
        sUriMatcher.addURI(Contract.CONTENT_AUTHORITY, Contract.PATH_KAWRUH_BASA + "/#", KAWRUHBASA_ID);

        sUriMatcher.addURI(Contract.CONTENT_AUTHORITY, Contract.PATH_KESUSASTRAAN, KESUSASTRAAN);
        sUriMatcher.addURI(Contract.CONTENT_AUTHORITY, Contract.PATH_KESUSASTRAAN + "/#", KESUSASTRAAN_ID);

        sUriMatcher.addURI(Contract.CONTENT_AUTHORITY, Contract.PATH_AKSARA_JAWA, AKSARAJAWA);
        sUriMatcher.addURI(Contract.CONTENT_AUTHORITY, Contract.PATH_AKSARA_JAWA + "/#", AKSARAJAWA_ID);

        sUriMatcher.addURI(Contract.CONTENT_AUTHORITY, Contract.PATH_WAYANG_PURWA, WAYANGPURWA);
        sUriMatcher.addURI(Contract.CONTENT_AUTHORITY, Contract.PATH_WAYANG_PURWA + "/#", WAYANGPURWA_ID);
    }

    private DbHelper mDbHelper;

    @Override
    public boolean onCreate() {
        mDbHelper = new DbHelper(getContext());
        return false;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        SQLiteDatabase database = mDbHelper.getReadableDatabase();
        Cursor cursor;
        int match =sUriMatcher.match(uri);

        switch (match) {
            case PARAMASASTRA:
                cursor = database.query(Contract.ParamasastraEntry.TABLE_NAME, projection, selection, selectionArgs,
                        null, null, sortOrder);
                break;
            case PARAMASASTRA_ID:
                selection = Contract.ParamasastraEntry._ID + "=?";
                selectionArgs = new String[] { String.valueOf(ContentUris.parseId(uri)) };
                cursor = database.query(Contract.ParamasastraEntry.TABLE_NAME, projection, selection, selectionArgs,
                        null, null, sortOrder);
                break;
            case RUPAKAWRUH:
                cursor = database.query(Contract.RupaKawruhEntry.TABLE_NAME, projection, selection, selectionArgs,
                        null, null, sortOrder);
                break;
            case RUPAKAWRUH_ID:
                selection = Contract.RupaKawruhEntry._ID + "=?";
                selectionArgs = new String[] { String.valueOf(ContentUris.parseId(uri)) };
                cursor = database.query(Contract.RupaKawruhEntry.TABLE_NAME, projection, selection, selectionArgs,
                        null, null, sortOrder);
                break;
            case KAWRUHBASA:
                cursor = database.query(Contract.KawruhBasaEntry.TABLE_NAME, projection, selection, selectionArgs,
                        null, null, sortOrder);
                break;
            case KAWRUHBASA_ID:
                selection = Contract.KawruhBasaEntry._ID + "=?";
                selectionArgs = new String[] { String.valueOf(ContentUris.parseId(uri)) };
                cursor = database.query(Contract.KawruhBasaEntry.TABLE_NAME, projection, selection, selectionArgs,
                        null, null, sortOrder);
                break;
            case KESUSASTRAAN:
                cursor = database.query(Contract.KesusastraanEntry.TABLE_NAME, projection, selection, selectionArgs,
                        null, null, sortOrder);
                break;
            case KESUSASTRAAN_ID:
                selection = Contract.KesusastraanEntry._ID + "=?";
                selectionArgs = new String[] { String.valueOf(ContentUris.parseId(uri)) };
                cursor = database.query(Contract.KesusastraanEntry.TABLE_NAME, projection, selection, selectionArgs,
                        null, null, sortOrder);
                break;
            case AKSARAJAWA:
                cursor = database.query(Contract.AksaraJawaEntry.TABLE_NAME, projection, selection, selectionArgs,
                        null, null, sortOrder);
                break;
            case AKSARAJAWA_ID:
                selection = Contract.AksaraJawaEntry._ID + "=?";
                selectionArgs = new String[] { String.valueOf(ContentUris.parseId(uri)) };
                cursor = database.query(Contract.AksaraJawaEntry.TABLE_NAME, projection, selection, selectionArgs,
                        null, null, sortOrder);
                break;
            case WAYANGPURWA:
                cursor = database.query(Contract.WayangPurwaEntry.TABLE_NAME, projection, selection, selectionArgs,
                        null, null, sortOrder);
                break;
            case WAYANGPURWA_ID:
                selection = Contract.WayangPurwaEntry._ID + "=?";
                selectionArgs = new String[] { String.valueOf(ContentUris.parseId(uri)) };
                cursor = database.query(Contract.WayangPurwaEntry.TABLE_NAME, projection, selection, selectionArgs,
                        null, null, sortOrder);
                break;
            default:
                throw new IllegalArgumentException("Cannot query unknown URI " + uri);
        }
        cursor.setNotificationUri(getContext().getContentResolver(),uri);
        return cursor;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        final int match = sUriMatcher.match(uri);
        switch (match) {
            case PARAMASASTRA:
                return Contract.ParamasastraEntry.CONTENT_LIST_TYPE;
            case PARAMASASTRA_ID:
                return Contract.ParamasastraEntry.CONTENT_ITEM_TYPE;
            case RUPAKAWRUH:
                return Contract.RupaKawruhEntry.CONTENT_LIST_TYPE;
            case RUPAKAWRUH_ID:
                return Contract.RupaKawruhEntry.CONTENT_ITEM_TYPE;
            case KAWRUHBASA:
                return Contract.KawruhBasaEntry.CONTENT_LIST_TYPE;
            case KAWRUHBASA_ID:
                return Contract.KawruhBasaEntry.CONTENT_ITEM_TYPE;
            case KESUSASTRAAN:
                return Contract.KesusastraanEntry.CONTENT_LIST_TYPE;
            case KESUSASTRAAN_ID:
                return Contract.KesusastraanEntry.CONTENT_ITEM_TYPE;
            case AKSARAJAWA:
                return Contract.AksaraJawaEntry.CONTENT_LIST_TYPE;
            case AKSARAJAWA_ID:
                return Contract.AksaraJawaEntry.CONTENT_ITEM_TYPE;
            case WAYANGPURWA:
                return Contract.WayangPurwaEntry.CONTENT_LIST_TYPE;
            case WAYANGPURWA_ID:
                return Contract.WayangPurwaEntry.CONTENT_ITEM_TYPE;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri + " with match " + match);
        }
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        final int match = sUriMatcher.match(uri);
        switch (match) {
            case PARAMASASTRA:
                return insertParamasastra(uri, values);
            case RUPAKAWRUH:
                return insertRupakawruh(uri, values);
            case KAWRUHBASA:
                return insertKawruhbasa(uri, values);
            case KESUSASTRAAN:
                return insertKesusastraan(uri, values);
            case AKSARAJAWA:
                return insertAksarajawa(uri, values);
            case WAYANGPURWA:
                return insertWayangpurwa(uri, values);
            default:
                throw new IllegalArgumentException("Insertion is not supported for " + uri);
        }
    }

    private Uri insertParamasastra(Uri uri, ContentValues values){
        String jawa = values.getAsString(Contract.ParamasastraEntry.COLUMN_JAWA);
        String translate = values.getAsString(Contract.ParamasastraEntry.COLUMN_TRANSLATE);
        SQLiteDatabase database = mDbHelper.getWritableDatabase();
        long id = database.insert(Contract.ParamasastraEntry.TABLE_NAME, null, values);
        getContext().getContentResolver().notifyChange(uri, null);
        return ContentUris.withAppendedId(uri, id);
    }

    private Uri insertRupakawruh(Uri uri, ContentValues values){
        String jawa = values.getAsString(Contract.RupaKawruhEntry.COLUMN_JAWA);
        String translate = values.getAsString(Contract.RupaKawruhEntry.COLUMN_TRANSLATE);
        SQLiteDatabase database = mDbHelper.getWritableDatabase();
        long id = database.insert(Contract.RupaKawruhEntry.TABLE_NAME, null, values);
        getContext().getContentResolver().notifyChange(uri, null);
        return ContentUris.withAppendedId(uri, id);
    }

    private Uri insertKawruhbasa(Uri uri, ContentValues values){
        String jawa = values.getAsString(Contract.KawruhBasaEntry.COLUMN_JAWA);
        String translate = values.getAsString(Contract.KawruhBasaEntry.COLUMN_TRANSLATE);
        SQLiteDatabase database = mDbHelper.getWritableDatabase();
        long id = database.insert(Contract.KawruhBasaEntry.TABLE_NAME, null, values);
        getContext().getContentResolver().notifyChange(uri, null);
        return ContentUris.withAppendedId(uri, id);
    }

    private Uri insertKesusastraan(Uri uri, ContentValues values){
        String jawa = values.getAsString(Contract.KesusastraanEntry.COLUMN_JAWA);
        String translate = values.getAsString(Contract.KesusastraanEntry.COLUMN_TRANSLATE);
        SQLiteDatabase database = mDbHelper.getWritableDatabase();
        long id = database.insert(Contract.KesusastraanEntry.TABLE_NAME, null, values);
        getContext().getContentResolver().notifyChange(uri, null);
        return ContentUris.withAppendedId(uri, id);
    }

    private Uri insertAksarajawa(Uri uri, ContentValues values){
        String jawa = values.getAsString(Contract.AksaraJawaEntry.COLUMN_JAWA);
        String translate = values.getAsString(Contract.AksaraJawaEntry.COLUMN_TRANSLATE);
        SQLiteDatabase database = mDbHelper.getWritableDatabase();
        long id = database.insert(Contract.AksaraJawaEntry.TABLE_NAME, null, values);
        getContext().getContentResolver().notifyChange(uri, null);
        return ContentUris.withAppendedId(uri, id);
    }

    private Uri insertWayangpurwa(Uri uri, ContentValues values){
        String jawa = values.getAsString(Contract.WayangPurwaEntry.COLUMN_JAWA);
        String translate = values.getAsString(Contract.WayangPurwaEntry.COLUMN_TRANSLATE);
        SQLiteDatabase database = mDbHelper.getWritableDatabase();
        long id = database.insert(Contract.WayangPurwaEntry.TABLE_NAME, null, values);
        getContext().getContentResolver().notifyChange(uri, null);
        return ContentUris.withAppendedId(uri, id);
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        SQLiteDatabase database = mDbHelper.getWritableDatabase();
        int rowsDeleted;
        final int match = sUriMatcher.match(uri);
        switch (match) {
            case PARAMASASTRA:
                rowsDeleted = database.delete(Contract.ParamasastraEntry.TABLE_NAME, selection, selectionArgs);
                break;
            case RUPAKAWRUH:
                rowsDeleted = database.delete(Contract.RupaKawruhEntry.TABLE_NAME, selection, selectionArgs);
                break;
            case KAWRUHBASA:
                rowsDeleted = database.delete(Contract.KawruhBasaEntry.TABLE_NAME, selection, selectionArgs);
                break;
            case KESUSASTRAAN:
                rowsDeleted = database.delete(Contract.KesusastraanEntry.TABLE_NAME, selection, selectionArgs);
                break;
            case AKSARAJAWA:
                rowsDeleted = database.delete(Contract.AksaraJawaEntry.TABLE_NAME, selection, selectionArgs);
                break;
            case WAYANGPURWA:
                rowsDeleted = database.delete(Contract.WayangPurwaEntry.TABLE_NAME, selection, selectionArgs);
                break;
            default:
                throw new IllegalArgumentException("Deletion is not supported for " + uri);
        }

        if (rowsDeleted != 0) {
            getContext().getContentResolver().notifyChange(uri, null);
        }

        return rowsDeleted;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }
}
