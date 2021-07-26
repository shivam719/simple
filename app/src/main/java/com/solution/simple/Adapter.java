package com.solution.simple;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    private List<Model> list;

    public Adapter(List<Model> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        int resource=list.get(position).getImage();
        String textClass=list.get(position).getTextView();
        holder.setData(resource,textClass);
    }

    @Override
    public int getItemCount() {

        return getItemCount();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview);
            textView=itemView.findViewById(R.id.textview);

        }

        private void setData(int images,String textViews){

            imageView.setImageResource(images);
            textView.setText(textViews);

        }
    }
}
