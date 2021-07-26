package com.solution.simple;

import android.app.Application;

import com.onesignal.OneSignal;

public class notifactiionpush extends Application {
    private static final String ONESIGNAL_APP_ID = "c89a5930-b77c-40a5-875b-e85c48931dfd";
    @Override
    public void onCreate() {
        super.onCreate();
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}
