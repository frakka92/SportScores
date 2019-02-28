package com.example.android.sportscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.sportscores.R;

public class MainActivity extends AppCompatActivity {

    private int goalJuventus = 0;
    private int yellowCardsJuve = 0;
    private int redCardsJuve = 0;

    private int scorePens = 0;
    private int offsidePens = 0;
    private int penaltyMinutesPens = 0;

    public int getGoalJuventus() {
        return goalJuventus;
    }

    public void setGoalJuventus(int goalJuventus) {
        this.goalJuventus = goalJuventus;
    }

    public int getYellowCardsJuve() {
        return yellowCardsJuve;
    }

    public void setYellowCardsJuve(int yellowCardsJuve) {
        this.yellowCardsJuve = yellowCardsJuve;
    }

    public int getRedCardsJuve() {
        return redCardsJuve;
    }

    public void setRedCardsJuve(int redCardsJuve) {
        this.redCardsJuve = redCardsJuve;
    }

    public int getScorePens() {
        return scorePens;
    }

    public void setScorePens(int scorePens) {
        this.scorePens = scorePens;
    }

    public int getOffsidePens() {
        return offsidePens;
    }

    public void setOffsidePens(int offsidePens) {
        this.offsidePens = offsidePens;
    }

    public int getPenaltyMinutesPens() {
        return penaltyMinutesPens;
    }

    public void setPenaltyMinutesPens(int penaltyMinutesPens) {
        this.penaltyMinutesPens = penaltyMinutesPens;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Displays Pens
     */

    public void addScorePens(View view) {
        this.setScorePens(1 + this.getScorePens());
        TextView scoreView = (TextView) findViewById(R.id.pens_score);
        scoreView.setText(String.valueOf(this.getScorePens()));
    }

    public void addOffsidePens(View view) {
        this.setOffsidePens(1 + this.getOffsidePens());
        TextView offsideView = (TextView) findViewById(R.id.offside_pens);
        offsideView.setText(String.valueOf(this.getOffsidePens()));
    }

    public void addTimePenaltyPens(View view) {
        this.setPenaltyMinutesPens(1 + this.getPenaltyMinutesPens());
        TextView penaltyView = (TextView) findViewById(R.id.time_penalty_pens);
        penaltyView.setText(String.valueOf(this.getPenaltyMinutesPens()));
    }

    /**
     * Juventus
     */

    public void addGoalJuve(View view) {
        this.setGoalJuventus(1 + this.getGoalJuventus());
        TextView goalView = (TextView) findViewById(R.id.juve_goals);
        goalView.setText(String.valueOf(this.getGoalJuventus()));
    }

    public void addYellowCardsJuve(View view) {
        this.setYellowCardsJuve(1 + this.getYellowCardsJuve());
        TextView yellowView = (TextView) findViewById(R.id.yellow_fouls_juve);
        yellowView.setText(String.valueOf(this.getYellowCardsJuve()));

    }

    public void addRedCardsJuve(View view) {
        this.setRedCardsJuve(1 + this.getRedCardsJuve());
        TextView redView = (TextView) findViewById(R.id.red_cards_juve);
        redView.setText(String.valueOf(this.getRedCardsJuve()));
    }

    public void reset(View view) {
        this.setScorePens(0);
        TextView scoreView = (TextView) findViewById(R.id.pens_score);
        scoreView.setText(String.valueOf(this.getScorePens()));

        this.setOffsidePens(0);
        TextView offsideView = (TextView) findViewById(R.id.offside_pens);
        offsideView.setText(String.valueOf(this.getOffsidePens()));

        this.setPenaltyMinutesPens(0);
        TextView penaltyView = (TextView) findViewById(R.id.time_penalty_pens);
        penaltyView.setText(String.valueOf(this.getPenaltyMinutesPens()));

        this.setGoalJuventus(0);
        TextView goalView = (TextView) findViewById(R.id.juve_goals);
        goalView.setText(String.valueOf(this.getGoalJuventus()));

        this.setYellowCardsJuve(0);
        TextView yellowView = (TextView) findViewById(R.id.yellow_fouls_juve);
        yellowView.setText(String.valueOf(this.getYellowCardsJuve()));

        this.setRedCardsJuve(0);
        TextView redView = (TextView) findViewById(R.id.red_cards_juve);
        redView.setText(String.valueOf(this.getRedCardsJuve()));

    }
}
