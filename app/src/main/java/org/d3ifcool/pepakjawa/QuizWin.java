package org.d3ifcool.pepakjawa;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import info.hoang8f.widget.FButton;

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

        FButton fButton= (FButton) findViewById(R.id.platygaianbutton);
            fButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(QuizWin.this, StartQuiz.class);
                    startActivity(intent);
                    finish();
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                }
            });
    }
    @Override
    public void onBackPressed() {
        finish();
//        audioBackground.stop();
        QuizWin.this.finish();
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
