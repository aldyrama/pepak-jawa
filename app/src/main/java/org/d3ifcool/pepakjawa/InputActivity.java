package org.d3ifcool.pepakjawa;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.d3ifcool.pepakjawa.Database.Contract;

public class InputActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor> {

    private static final int EXISTING_PARAMASASTRA_LOADER = 0;

    private Uri mCurrentParamasastraUri;

    EditText jawa, translate;
    Button tambah, lihat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        jawa = findViewById(R.id.jawa);
        translate = findViewById(R.id.transalate);
        tambah = findViewById(R.id.tambah);
        lihat = findViewById(R.id.lihat);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertParamasastra();
            }
        });

        lihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        getSupportLoaderManager().initLoader(EXISTING_PARAMASASTRA_LOADER, null, this);
    }
    private boolean insertParamasastra() {
        ContentValues values = new ContentValues();
        values.put(Contract.ParamasastraEntry.COLUMN_JAWA,jawa.getText().toString());
        values.put(Contract.ParamasastraEntry.COLUMN_TRANSLATE,translate.getText().toString());


        try {
            if (mCurrentParamasastraUri == null) {
                getContentResolver().insert(Contract.ParamasastraEntry.CONTENT_PARAMASASTRA_URI, values);
            } else {
                getContentResolver().update(mCurrentParamasastraUri, values, null,null);
            }
        } catch (IllegalArgumentException e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();

            return false;
        }
        return true;
    }



    @NonNull
    @Override
    public Loader<Cursor> onCreateLoader(int id, @Nullable Bundle args) {
        String [] projection = {
                Contract.ParamasastraEntry._ID,
                Contract.ParamasastraEntry.COLUMN_JAWA,
                Contract.ParamasastraEntry.COLUMN_TRANSLATE};
        return new CursorLoader(this,
                mCurrentParamasastraUri,
                projection,
                null,
                null,
                null);
    }

    @Override
    public void onLoadFinished(@NonNull Loader<Cursor> loader, Cursor data) {
        if (data == null || data.getCount() < 1){
            return;
        }

        if (data.moveToFirst()){
            int jawaColumnIndex = data.getColumnIndex(Contract.ParamasastraEntry.COLUMN_JAWA);
            int translateColumnIndex = data.getColumnIndex(Contract.ParamasastraEntry.COLUMN_TRANSLATE);

            String date = data.getString(jawaColumnIndex);
            String title = data.getString(translateColumnIndex);

            jawa.setText(date);
            translate.setText(title);
        }
    }

    @Override
    public void onLoaderReset(@NonNull Loader<Cursor> loader) {
        jawa.setText("");
        translate.setText("");
    }
}
