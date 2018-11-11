package org.d3ifcool.pepakjawa;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.gesture.Gesture;
import android.gesture.GestureLibraries;
import android.gesture.GestureLibrary;
import android.gesture.GestureOverlayView;
import android.gesture.Prediction;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.ArrayList;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class InsetAksara extends AppCompatActivity implements GestureOverlayView.OnGesturePerformedListener{
    GestureLibrary mLibrary;
    MediaPlayer audiobackgroud;

    //inisialisasi urutan aksara
    private int Line = 1;

    private String aksara = "";

    //instansiasi objek view
    private ImageView inset, inset1, aksarawrite;
    private LinearLayout writearea, correctrwrite, wrongwrite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        setContentView(R.layout.activity_inset_aksara);

        //memanggil urutan aksara
        Line = extras.getInt("aksara");

        //Linkage object ke view layout
        inset = (ImageView) findViewById(R.id.card_inset_aksara);
        inset1 = (ImageView) findViewById(R.id.card_inset__ssound);

        writearea = (LinearLayout) findViewById(R.id.write);
        correctrwrite = (LinearLayout) findViewById(R.id.correct);
        wrongwrite = (LinearLayout) findViewById(R.id.wrong);

        //memanggil fungsi load aksara
        aksaraSelector(Line);

        mLibrary = GestureLibraries.fromRawResource(this, R.raw.gestures);
        if (!mLibrary.load()) {
            finish();
        }

        GestureOverlayView gestures = (GestureOverlayView) findViewById(R.id.gestures);
        gestures.addOnGesturePerformedListener(this);

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    public void front(View V) {
        Line++;
        if (Line == 20 || Line > 20) {
            Line = 20;
        }
        aksaraSelector(Line);
    }

    public void back(View V) {
        Line--;
        if (Line == 1 || Line < 1) {
            Line = 1;
        }
        aksaraSelector(Line);
    }

    //Aksara Loader dengan parameter urutan
    private void aksaraSelector(int selector) {
        switch (selector) {
            case 1:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ha.png").into(inset);
                aksara = "ha";
                break;

            case 2:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/na.png").into(inset);
                aksara = "na";
                break;

            case 3:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ca.png").into(inset);
                aksara = "ca";
                break;

            case 4:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ra.png").into(inset);
                aksara = "ra";
                break;

            case 5:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ka.png").into(inset);
                aksara = "ka";
                break;

            case 6:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/da.png").into(inset);
                aksara = "da";
                break;

            case 7:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ta.png").into(inset);
                aksara = "ta";
                break;

            case 8:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/sa.png").into(inset);
                aksara = "sa";
                break;

            case 9:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/wa.png").into(inset);
                aksara = "wa";
                break;

            case 10:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/la.png").into(inset);
                aksara = "la";
                break;

            case 11:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/pa.png").into(inset);
                aksara = "pa";
                break;

            case 12:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/dha.png").into(inset);
                aksara = "dha";
                break;

            case 13:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ja.png").into(inset);
                aksara = "ja";
                break;

            case 14:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ya.png").into(inset);
                aksara = "ya";
                break;

            case 15:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/nya.png").into(inset);
                aksara = "nya";
                break;

            case 16:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ma.png").into(inset);
                aksara = "ma";
                break;

            case 17:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ga.png").into(inset);
                aksara = "ga";
                break;

            case 18:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ba.png").into(inset);
                aksara = "ba";
                break;

            case 19:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/tha.png").into(inset);
                aksara = "tha";
                break;

            case 20:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/nga.png").into(inset);
                aksara = "nga";
                break;
        }
    }

    //handle button play sound
    public void playsound(View view) {
        inset1.setImageDrawable(getResources().getDrawable(R.drawable.soundon));
        inset1.setEnabled(false);
        Play(String.valueOf(Line));
    }


    //handle play sound
    public void Play(String fileName) {
        AssetFileDescriptor descriptor = null;
        try {
            descriptor = getApplicationContext().getAssets().openFd("sound/" + fileName + ".mp3");
        } catch (IOException e) {
            e.printStackTrace();
        }
        long start = descriptor.getStartOffset();
        long end = descriptor.getLength();
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource(descriptor.getFileDescriptor(), start, end);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                inset1.setImageDrawable(getResources().getDrawable(R.drawable.soundof));
                inset1.setEnabled(true);
            }
        });
        mediaPlayer.start();

    }

    //handle kebenaran
    public void setCorrect() {
        writearea.setEnabled(false);
        correctrwrite.setVisibility(View.VISIBLE);
        wrongwrite.setVisibility(View.GONE);
    }

    public void setwrong() {
        writearea.setEnabled(false);
        correctrwrite.setVisibility(View.GONE);
        wrongwrite.setVisibility(View.VISIBLE);
    }


    //handle lanjut karakter
    public void next(View V) {
        Line = Line + 1;
        if (Line < 21) {
            Intent i = new Intent(InsetAksara.this, InsetAksara.class);
            i.putExtra("aksara", Line);
            startActivity(i);
            finish();
        } else {
            finish();
        }

    }

    //handle lanjut karakter
    public void wrongwrite(View V) {
        Intent i = new Intent(InsetAksara.this, InsetAksara.class);
        i.putExtra("aksara", Line);
        startActivity(i);
        finish();
    }

    //handling gesture
    @Override
    public void onGesturePerformed(GestureOverlayView overlay, Gesture gesture) {
        ArrayList<Prediction> predictions = mLibrary.recognize(gesture);
        if (predictions.size() > 0 && predictions.get(0).score > 1.0) {
            String result = predictions.get(0).name;

            if (aksara.equalsIgnoreCase(result)) {
                setCorrect();
                audiobackgroud = MediaPlayer.create(this, R.raw.correctwrite);
                audiobackgroud.setVolume(1,1);
                audiobackgroud.start();
            } else{
                setwrong();
                audiobackgroud = MediaPlayer.create(this, R.raw.wrongwrite);
                audiobackgroud.setVolume(1,1);
                audiobackgroud.start();
            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

}
