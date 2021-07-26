package com.solution.simple;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class RecyclearAdapter extends RecyclerView.Adapter<RecyclearAdapter.ViewHolder> {

    Context context;
    String []lists;
    int[]images;

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {

       LayoutInflater inflater = LayoutInflater.from(context);
       View view = inflater.inflate(R.layout.activity_ere,parent,false);
       ViewHolder viewholder=new ViewHolder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull RecyclearAdapter.ViewHolder holder, int position) {
     holder.tv.setText(lists[position]);
     holder.iv.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return lists.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv;
        ImageView iv;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.textview);
            iv=itemView.findViewById(R.id.imageview);
        }
    }
}
