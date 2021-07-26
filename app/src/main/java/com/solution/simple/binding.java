package com.solution.simple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import android.widget.ImageView;
import android.widget.TextView;

public class binding extends AppCompatActivity {
    RecyclerView recyclerView;
    TextView textView;
    ImageView imageView;
    RecyclerView.Adapter program;
    RecyclerView.LayoutManager layoutManager;
    String[] text={ "s1","s2","s3","s4"};
    int [] image={R.drawable.s1,R.drawable.s2,R.drawable.s3,R.drawable.s4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binding);
        textView=findViewById(R.id.textview);
        imageView=findViewById(R.id.imageview);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(layoutManager);
    }
}