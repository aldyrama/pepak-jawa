package org.d3ifcool.pepakjawa;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.internal.Objects;

public class KuisActivity extends AppCompatActivity {

    AlertDialog.Builder builder;
    RadioGroup radiogroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        radiogroup = (RadioGroup) findViewById(R.id.radioGroup);

    }

    public void onRadioButton (View view) {
        Boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radioButton:
                if (checked)
                    jawabanSalah();
                break;
            case R.id.radioButton2:
                if (checked)
                    jawabanSalah();
                break;
            case R.id.radioButton3:
                if (checked)
                    tampilDialog();
                break;
            case R.id.radioButton4:
                if (checked)
                    jawabanSalah();
                break;
        }
    }

    //menampilkan toast salah
    private void jawabanSalah() {
        Toast.makeText(this, "Jawaban anda Salah", Toast.LENGTH_SHORT).show();
    }

    private void tampilDialog() {
        builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Selamat!");
        builder.setMessage("Jawaban anda benar");
    }
}
