package com.solution.simple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.gauravk.bubblenavigation.IBubbleNavigation;

public class MainActivity extends AppCompatActivity {


    IBubbleNavigation bubbleNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bubbleNavigation.setNavigationChangeListener((view, position) -> {

            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                @Override
                public void run() {

                    startActivity(new Intent(MainActivity.this,Introduction.class));
                    finish();

                }
            },5000);
        });
    }
}