package com.solution.simple;

import android.app.Service;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.IBinder;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;


import androidx.annotation.Nullable;

public class  bubble_services extends Service {

    WindowManager windowManager;
    private View ChartView;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null ;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ChartView= LayoutInflater.from(this).inflate(R.layout.bb,null);
        final WindowManager.LayoutParams params=new WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.TYPE_PHONE,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                PixelFormat.TRANSPARENT);

        params.gravity= Gravity.TOP |Gravity.LEFT;
        params.x=0;
        params.y=100;
        windowManager=(WindowManager) getSystemService(WINDOW_SERVICE);
        windowManager.addView(ChartView,params);
        ImageView cheartHeadView=ChartView.findViewById(R.id.imageview);
        cheartHeadView.setOnTouchListener(new View.OnTouchListener() {

            private int initialX;
            private int initialY;
            private float TouchX;
            private float TouchY;
            private int LastAction;
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    initialX=params.x;
                    initialY=params.y;
                    TouchX=event.getX();
                    TouchY=event.getY();
                    LastAction= event.getAction();

                    return true;
                }
                if(event.getAction()==MotionEvent.ACTION_UP){
                    if(event.getAction()==MotionEvent.ACTION_DOWN)
                    {
                        Button Button=new Button(bubble_services.this);
                        Button.setText("Close");
                        RelativeLayout layout=ChartView.findViewById(R.id.CheartHeadBubble);
                        layout.addView(Button);

                        Button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        });
                    }
                    LastAction=event.getAction();
                    return true;
                }
                if
                (event.getAction()==MotionEvent.ACTION_MOVE)
                {
                    params.x+=initialX+(int)(event.getRawX()-TouchX);
                    params.y=initialY +(int)(event.getRawY()-TouchY);

                    windowManager.updateViewLayout(ChartView,params);

                    LastAction=event.getAction();
                    return true;
                }
                return false;
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        if(ChartView!=null) {
            windowManager.removeView(ChartView);
        }
    }
}
