package com.example.assignment2_tuba_asif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class level_selection_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selection_activity);
    }
    public void beginnerlevel(View v){
            Intent in = new Intent(this,CreatePiles_activity.class);
            startActivity(in);
    }
    public void advancelevel(View v){
        Intent in = new Intent(this,CreatePiles_activity.class);
        startActivity(in);
    }
    public void showpreviousrecord(View v){
        Intent in = new Intent(this,previousScore_activity.class);
        startActivity(in);
    }
}