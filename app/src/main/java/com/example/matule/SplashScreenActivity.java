package com.example.matule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);

                if(!prefs.getBoolean("completed", false)) {
                    startActivity(new Intent(SplashScreenActivity.this, OnBoardFirstActivity.class));
                } else {
                    startActivity(new Intent(SplashScreenActivity.this, SignInActivity.class));
                }
            }
        }, 2000);
    }
}