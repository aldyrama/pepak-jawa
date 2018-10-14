package org.d3ifcool.pepakjawa;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import java.util.Collections;
import java.util.List;


import info.hoang8f.widget.FButton;

public class QuizActivity extends AppCompatActivity {
    FButton buttonA, buttonB, buttonC, buttonD;
    TextView questionText, triviaQuizText, timeText, resultText, coinText, txtHighscore;
    QuizHelper QuizHelper;
    Question currentQuestion;
    List<Question> list;
    int qid = 0;
    int timeValue = 10;
    int coinValue = 0;
    CountDownTimer countDownTimer;
    Typeface tb, sb;
    MediaPlayer audioBackground;
    TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_main);

        questionText = (TextView) findViewById(R.id.triviaQuestion);
        buttonA = (FButton) findViewById(R.id.buttonA);
        buttonB = (FButton) findViewById(R.id.buttonB);
        buttonC = (FButton) findViewById(R.id.buttonC);
        buttonD = (FButton) findViewById(R.id.buttonD);
        triviaQuizText = (TextView) findViewById(R.id.triviaQuizText);
        timeText = (TextView) findViewById(R.id.timeText);
        resultText = (TextView) findViewById(R.id.resultText);
        coinText = (TextView) findViewById(R.id.coinText);
        txtHighscore = (TextView) findViewById(R.id.coinText);
        score = (TextView) findViewById(R.id.coinText);

    QuizHelper = new QuizHelper(this);
        QuizHelper.getWritableDatabase();
        if (QuizHelper.getAllOfTheQuestions().size() == 0) {
            QuizHelper.allQuestion();
        }

        //This will return us a list of data type Question
        list = QuizHelper.getAllOfTheQuestions();
        Collections.shuffle(list);
        currentQuestion = list.get(qid);

        countDownTimer = new CountDownTimer(12000, 1000) {
            public void onTick(long millisUntilFinished) {
                timeText.setText(String.valueOf(timeValue) + "\"");
                timeValue -= 1;
                if (timeValue == -1) {
                    resultText.setText("Waktu Habis");
                    disableButton();
                }
            }

            public void onFinish() {
                timeUp();
            }
        }.start();
        updateQueAndOptions();
    }

    public void updateQueAndOptions() {

        questionText.setText(currentQuestion.getQuestion());
        buttonA.setText(currentQuestion.getOptA());
        buttonB.setText(currentQuestion.getOptB());
        buttonC.setText(currentQuestion.getOptC());
        buttonD.setText(currentQuestion.getOptD());

        timeValue = 10;
        countDownTimer.cancel();
        countDownTimer.start();
        coinText.setText(String.valueOf(Data.score));
        Data.score++;
    }

    public void buttonA(View view) {
        if (currentQuestion.getOptA().equals(currentQuestion.getAnswer())) {
            buttonA.setButtonColor(ContextCompat.getColor(getApplicationContext(),R.color.lightGreen));
            if (qid < list.size() - 1) {
                disableButton();
                correctDialog();
            }
            else {
                gameWon();
            }
        }
        else {
            gameLostPlayAgain();
        }
    }

    public void buttonB(View view) {
        if (currentQuestion.getOptB().equals(currentQuestion.getAnswer())) {
            buttonB.setButtonColor(ContextCompat.getColor(getApplicationContext(),R.color.lightGreen));
            if (qid < list.size() - 1) {
                disableButton();
                correctDialog();
            } else {
                gameWon();
            }
        } else {
            gameLostPlayAgain();
        }
    }

    public void buttonC(View view) {
        if (currentQuestion.getOptC().equals(currentQuestion.getAnswer())) {
            buttonC.setButtonColor(ContextCompat.getColor(getApplicationContext(),R.color.lightGreen));
            if (qid < list.size() - 1) {
                disableButton();
                correctDialog();
            } else {
                gameWon();
            }
        } else {

            gameLostPlayAgain();
        }
    }

    public void buttonD(View view) {
        if (currentQuestion.getOptD().equals(currentQuestion.getAnswer())) {
            buttonD.setButtonColor(ContextCompat.getColor(getApplicationContext(),R.color.lightGreen));
            if (qid < list.size() - 1) {
                disableButton();
                correctDialog();
            } else {
                gameWon();
            }
        } else {
            gameLostPlayAgain();
        }
    }

    public void gameWon() {
        Intent intent = new Intent(this, QuizWin.class);
        startActivity(intent);
        finish();
    }

    public void gameLostPlayAgain() {
        score.setText(String.valueOf(Data.score-1));
        Intent intent = new Intent(this, PlayAgain.class);
        startActivity(intent);
        finish();
//        audioBackground = MediaPlayer.create(this, R.raw.wrong);
//        audioBackground.setLooping(false);
//        audioBackground.setVolume(1,1);
//        audioBackground.start();
    }

    public void timeUp() {
        Intent intent = new Intent(this, Time_Up.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        countDownTimer.start();
    }
    @Override
    protected void onStop() {
        super.onStop();
        countDownTimer.cancel();
    }

    @Override
    protected void onPause() {
        super.onPause();
        countDownTimer.cancel();
    }

    //On BackPressed
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, StartQuiz.class);
        startActivity(intent);
        finish();
    }

    public void correctDialog() {
        final Dialog dialogCorrect = new Dialog(QuizActivity.this);
        dialogCorrect.requestWindowFeature(Window.FEATURE_NO_TITLE);
        if (dialogCorrect.getWindow() != null) {
            ColorDrawable colorDrawable = new ColorDrawable(Color.TRANSPARENT);
            dialogCorrect.getWindow().setBackgroundDrawable(colorDrawable);
        }
        dialogCorrect.setContentView(R.layout.dialog_correct);
        dialogCorrect.setCancelable(false);
        dialogCorrect.show();

        onPause();

//        audioBackground = MediaPlayer.create(this, R.raw.correct);
//        audioBackground.setLooping(false);
//        audioBackground.setVolume(1,1);
//        audioBackground.start();


        TextView correctText = (TextView) dialogCorrect.findViewById(R.id.correctText);
        FButton buttonNext = (FButton) dialogCorrect.findViewById(R.id.dialogNext);

        correctText.setTypeface(sb);
        buttonNext.setTypeface(sb);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogCorrect.dismiss();
                qid++;
                currentQuestion = list.get(qid);
                updateQueAndOptions();
                resetColor();
                enableButton();
            }
        });
    }

    public void resetColor() {
        buttonA.setButtonColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
        buttonB.setButtonColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
        buttonC.setButtonColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
        buttonD.setButtonColor(ContextCompat.getColor(getApplicationContext(),R.color.white));
    }

    public void disableButton() {
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);
    }

    public void enableButton() {
        buttonA.setEnabled(true);
        buttonB.setEnabled(true);
        buttonC.setEnabled(true);
        buttonD.setEnabled(true);
    }

}
