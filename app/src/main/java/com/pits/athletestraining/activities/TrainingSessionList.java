package com.pits.athletestraining.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.pits.athletestraining.R;

public class TrainingSessionList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_training_session);
        getSupportActionBar().hide();
    }
}
