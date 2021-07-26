package com.solution.simple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.messaging.FirebaseMessaging;

public class PushNotificationFirebaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push_notification_firebase);
        FirebaseMessaging.getInstance().subscribeToTopic("Our systems have detected" +
                " unusual traffic from your computer network. This page checks to see if it's really you sending " +
                "the requests, and not a robot. Why did this happen?");

    }
}