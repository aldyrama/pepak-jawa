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
//        playAgainButton = (FButton)findViewById(R.id.playAgainButton);
        timeUpText = (TextView)findViewById(R.id.timeUpText);
//        downButton = (FButton) findViewById(R.id.downtime);
        score = (TextView) findViewById(R.id.new_score);

        score.setText(String.valueOf(Data.score-1));

//        audioBackground = MediaPlayer.create(this, R.raw.timeup);
//        audioBackground.setLooping(false);
//        audioBackground.setVolume(1,1);
//        audioBackground.start();

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Time_Up.this, StartQuiz.class);
                startActivity(intent);
                finish();
            }
        }, 3000);

//        playAgainButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Data.score = 0;
//                Intent intent = new Intent(Time_Up.this,QuizActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });
//
//        downButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Time_Up.this,StartQuiz.class);
//                startActivity(intent);
//                score.setText(String.valueOf(Data.score-1));
//                finish();
//            }
//        });
//
    }

        @Override
        public void onBackPressed() {
            super.onBackPressed();
            finish();
    }
}
