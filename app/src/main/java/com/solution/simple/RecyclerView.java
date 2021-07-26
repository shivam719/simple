package com.solution.simple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class RecyclerView extends AppCompatActivity {

    androidx.recyclerview.widget.RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recycler=findViewById(R.id.recyclerview22);

        LinearLayoutManager manager=new LinearLayoutManager(this);

        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setLayoutManager(manager);
         List<Model>modelsList=new ArrayList<>();

         modelsList.add(new Model(R.drawable.circle_logo,"s1"));
         modelsList.add(new Model(R.drawable.ic_baseline_home_24,"s2"));

        Adapter adapter=new Adapter(modelsList);
        recycler.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}