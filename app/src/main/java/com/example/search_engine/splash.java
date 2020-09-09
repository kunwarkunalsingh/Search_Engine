package com.example.search_engine;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.*;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=4000;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splash.this,MainActivity.class));
            }
        },SPLASH_TIME_OUT);
   }
}
