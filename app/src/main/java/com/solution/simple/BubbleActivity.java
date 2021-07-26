package com.solution.simple;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;

public class BubbleActivity extends AppCompatActivity {

    public final static int  REQUEST_CODE=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && !Settings.canDrawOverlays(this))
        {
            Intent intent=new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("pakage"+getPackageName()));

            startActivityForResult(intent, REQUEST_CODE);

        }
        else
        {
            ShowChatHead();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable @org.jetbrains.annotations.Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_CODE)
        {
            if(requestCode==RESULT_OK)
            {
                ShowChatHead();
            }
        }
    }
    public void ShowChatHead() {
        startService(new Intent(BubbleActivity.this,bubble_services.class));
    }
}