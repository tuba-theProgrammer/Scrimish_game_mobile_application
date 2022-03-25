package com.example.assignment2_tuba_asif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);
    }
    public void loginAccbtn(View v){
        Intent in = new Intent(this,level_selection_activity.class);
        startActivity(in);
    }

    public void registerAccbtn(View v){
        Intent in = new Intent(this,RegisterAcc_activity.class);
        startActivity(in);
    }

}