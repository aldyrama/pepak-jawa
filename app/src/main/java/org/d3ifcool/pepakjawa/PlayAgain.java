package org.d3ifcool.pepakjawa;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;


public class PlayAgain extends Activity {

    Button playAgain;
    TextView wrongAnsText;
    TextView score;
    TextView newScore;
    Button finish;
    private int mScore = 0;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_again);
        //Initialize
//        playAgain = (Button) findViewById(R.id.playAgainButton);
        wrongAnsText = (TextView) findViewById(R.id.wrongAns);
        score = (TextView) findViewById(R.id.new_score);
//        finish = (Button) findViewById(R.id.down);

        score.setText(String.valueOf(Data.score - 1));

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(PlayAgain.this, QuizFragment.class);
                startActivity(intent);
                finish();

            }
        }, 1500);

    }

//        //play again button onclick listener
//        playAgain.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Data.score = 0;
//                Intent intent = new Intent(PlayAgain.this, QuizActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });
//
//     finish.setOnClickListener(new View.OnClickListener() {
//         @Override
//         public void onClick(View v) {
//             Intent intent = new Intent(PlayAgain.this, StartQuiz.class);
//             startActivity(intent);
//             finish();
//         }
//     });
//
//
//    }
//
//    public void down(View view) {
//        Intent intent = new Intent(PlayAgain.this, StartQuiz.class);
//        startActivity(intent);
//        score.setText(String.valueOf(Data.score-1));
//        finish();
//    }

    @Override
    public void onBackPressed() {
    }

}
