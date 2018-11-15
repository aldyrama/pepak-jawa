package org.d3ifcool.pepakjawa;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import info.hoang8f.widget.FButton;

public class Time_Up extends AppCompatActivity {
    FButton playAgainButton;
    TextView timeUpText;
    MediaPlayer audioBackground;
    FButton downButton;
    TextView score;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time__up);
        //Initialize
        timeUpText = (TextView) findViewById(R.id.timeUpText);
        score = (TextView) findViewById(R.id.new_score);

        score.setText(String.valueOf(Data.score - 1));

        audioBackground = MediaPlayer.create(this, R.raw.timeup);
        audioBackground.setLooping(false);
        audioBackground.setVolume(1,1);
        audioBackground.start();

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Time_Up.this, QuizFragment.class);
                startActivity(intent);
                finish();
            }
        }, 1500);
    }

        @Override
        public void onBackPressed() {
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
