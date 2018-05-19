package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTeamAScore;
    private TextView mTeamBScore;
    private Button mPlusThree;
    private Button mPlusTwo;
    private Button mFreeThrow;

    private int a_scores = 0;
    private int b_scores = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for team A.
     * @param score the score value being displayed.
     */
    private void displayForTeamA(int score) {
        mTeamAScore = findViewById(R.id.a_scores);
        mTeamAScore.setText(String.valueOf(score));
        // mTeamScore.setText("" + score);
    }

    /**
     * Displays the given score for team B.
     * @param score the score being displayed.
     */
    private void displayForTeamB(int score) {
        mTeamBScore = findViewById(R.id.b_scores);
        mTeamBScore.setText(String.valueOf(score));
    }


    public void aPlusThree(View v) {
        a_scores += 3;
        displayForTeamA(a_scores);
    }

    public void aPlusTwo(View v) {
        a_scores += 2;
        displayForTeamA(a_scores);
    }

    public void aFreeThrow(View v) {
        a_scores++;
        displayForTeamA(a_scores);
    }

    public void bPlusThree(View v) {
        b_scores += 3;
        displayForTeamB(b_scores);
    }

    public void bPlusTwo(View v) {
        b_scores += 2;
        displayForTeamB(b_scores);
    }

    public void bFreeThrow(View v) {
        b_scores++;
        displayForTeamB(b_scores);
    }

    /**
     *  Clear both teams score value.
     */
    public void resetScores(View v) {
        a_scores = 0;
        b_scores = 0;
        mTeamAScore.setText(String.valueOf(a_scores));
        mTeamBScore.setText(String.valueOf(b_scores));
    }
}
