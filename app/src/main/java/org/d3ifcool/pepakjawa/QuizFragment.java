package org.d3ifcool.pepakjawa;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.FileUriExposedException;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import info.hoang8f.widget.FButton;

public class QuizFragment extends Fragment {
    FButton playGame;
    TextView tQ, BestScore, txtHighScore;
    int coinvalue = 0;
    private Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_quiz, container, false);
        playGame =(FButton) v.findViewById(R.id.playGame);
        tQ = (TextView) v.findViewById(R.id.tQ);
        BestScore = (TextView) v.findViewById(R.id.best_score);
        txtHighScore = (TextView) v.findViewById(R.id.best_score);

        txtHighScore.setText(String.valueOf(Data.score-1));

        SharedPreferences mypref = PreferenceManager.getDefaultSharedPreferences(getContext());
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
                Intent intent = new Intent(view.getContext(), QuizActivity.class);
                startActivity(intent);
            }
        });
        return v;

    }

}
