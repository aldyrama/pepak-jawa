package org.d3ifcool.pepakjawa;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import info.hoang8f.widget.FButton;

public class StartQuiz extends AppCompatActivity {
    FButton playGame,quit;
    TextView tQ, BestScore, txtHighScore;
    int coinvalue = 0;
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        playGame =(FButton)findViewById(R.id.playGame);
        tQ = (TextView)findViewById(R.id.tQ);
        BestScore = (TextView) findViewById(R.id.best_score);
        txtHighScore = (TextView) findViewById(R.id.best_score);

        txtHighScore.setText(String.valueOf(Data.score-1));

        SharedPreferences mypref = PreferenceManager.getDefaultSharedPreferences(this);
        txtHighScore.setText(String.valueOf(Data.score-1));
        int highscore = mypref.getInt("highscore",0);
        if(highscore >= Data.score-1)
            txtHighScore.setText(" "+highscore);
        else
        {
            txtHighScore.setText(String.valueOf(Data.score-1));
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", Data.score-1);
            Data.bestScore = highscore;
            editor.commit();
        }

        playGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data.score = 0;
                Intent intent = new Intent(StartQuiz.this,QuizActivity.class);
                startActivity(intent);
                finish();
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });
   }

            @Override
            public void onBackPressed() {
                super.onBackPressed();
                finish();
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
