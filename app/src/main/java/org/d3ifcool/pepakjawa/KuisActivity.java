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

    private KuisBank mQuestionLibrary = new KuisBank();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoiche1;
    private Button mButtonChoiche2;
    private Button mButtonChoiche3;
    private Button mButtonChoiche4;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.questions);
        mButtonChoiche1 = (Button)findViewById(R.id.choice1);
        mButtonChoiche2 = (Button)findViewById(R.id.choice2);
        mButtonChoiche3 = (Button)findViewById(R.id.choice3);
        mButtonChoiche4 = (Button)findViewById(R.id.choice4);
        updateQuestion();
        updateScore(mScore);
    }

    private void updateQuestion() {
        if (mQuestionNumber < mQuestionLibrary.getLength()) {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoiche1.setText(mQuestionLibrary.getChoice(mQuestionNumber, 1));
            mButtonChoiche2.setText(mQuestionLibrary.getChoice(mQuestionNumber, 2));
            mButtonChoiche3.setText(mQuestionLibrary.getChoice(mQuestionNumber, 3));
            mButtonChoiche4.setText(mQuestionLibrary.getChoice(mQuestionNumber, 4));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        } else {
            Toast.makeText(KuisActivity.this, "It was the last question!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(KuisActivity.this, ScoreActivity.class);
            intent.putExtra("score", mScore); // pass the current score to the second screen
            startActivity(intent);
        }
    }
    private void updateScore(int point) {
        mScoreView.setText("" + mScore + "/" + mQuestionLibrary.getLength());
    }

    public void onClick(View view) {
        //all logic for all answers buttons in one method
        Button answer = (Button) view;
        // if the answer is correct, increase the score
        if (answer.getText() == mAnswer){
            mScore = mScore + 1;
            Toast.makeText(KuisActivity.this, "Benar!", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(KuisActivity.this, "Salah!", Toast.LENGTH_SHORT).show();
        updateScore(mScore);
        updateQuestion();

    }
}
