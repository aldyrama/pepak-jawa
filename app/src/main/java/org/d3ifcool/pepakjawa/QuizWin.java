package org.d3ifcool.pepakjawa;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class QuizWin extends Activity {

    MediaPlayer audioBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_won);

        audioBackground = MediaPlayer.create(this, R.raw.game);
        audioBackground.setLooping(false);
        audioBackground.setVolume(1,1);
        audioBackground.start();
    }

    //This is onclick listener for button
    //it will navigate from this activity to QuizActivity
    public void PlayAgain(View view) {
        Intent intent = new Intent(QuizWin.this, QuizActivity.class);
        startActivity(intent);
        finish();
        audioBackground.stop();
        QuizWin.this.finish();
    }

    @Override
    public void onBackPressed() {
        finish();
        audioBackground.stop();
        QuizWin.this.finish();
    }
}
