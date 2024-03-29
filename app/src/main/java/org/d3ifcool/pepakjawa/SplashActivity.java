package org.d3ifcool.pepakjawa;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class SplashActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        AssetManager assetManager = this.getAssets();
        InputStream is1= null;

        try {
            is1 = assetManager.open("img/ic_launcher_pepak");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bitmap bitmap1 = BitmapFactory.decodeStream(is1);
        ImageView logomil = (ImageView) findViewById(R.id.logomil);
        logomil.setImageBitmap(bitmap1);

        int SPLASH_TIME_OUT = 2500;
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                    Intent i = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(i);
                    finish();
            }
        }, SPLASH_TIME_OUT);

    }
}
