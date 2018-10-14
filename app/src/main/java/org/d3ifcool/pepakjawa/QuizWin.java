package org.d3ifcool.pepakjawa;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class QuizWin extends Activity {

    MediaPlayer audioBackground;
    TextView score;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_won);

//        audioBackground = MediaPlayer.create(this, R.raw.game);
//        audioBackground.setLooping(false);
//        audioBackground.setVolume(1,1);
//        audioBackground.start();

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Data.score = +1;
                Intent intent = new Intent(QuizWin.this, StartQuiz.class);
                startActivity(intent);
                finish();
//                audioBackground.stop();
                QuizWin.this.finish();
            }
        }, 5000);
    }

    @Override
    public void onBackPressed() {
        finish();
//        audioBackground.stop();
        QuizWin.this.finish();
    }
}
