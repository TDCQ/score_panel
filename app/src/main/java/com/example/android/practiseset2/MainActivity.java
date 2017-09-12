package com.example.android.practiseset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    final int one = 1;
    final int two = 2;
    final int three = 3;
  //  int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE

    }

    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */

    public void displayForTeamA() {
        TextView t = (TextView) findViewById(R.id.team_a_score);
        t.setText("" + scoreTeamA);
    }

    public void addOneForTeamA(View view) {
        scoreTeamA += one;
        displayForTeamA();
    }

    public void addTwoForTeamA(View view) {
        scoreTeamA += two;
        displayForTeamA();
    }

    public void addThreeForTeamA(View view) {
        scoreTeamA += three;
        displayForTeamA();
    }

    public void addThreeForTeamB(View view) {
        scoreTeamB += three;
        displayForTeamB();
    }

    public void addTwoForTeamB(View view) {
        scoreTeamB += two;
        displayForTeamB();
    }

    public void addOneForTeamB(View view) {
        scoreTeamB += one;
        displayForTeamB();
    }

    public void displayForTeamB() {
        TextView t = (TextView) findViewById(R.id.team_b_score);
        t.setText("" + scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA();
        displayForTeamB();
    }
}