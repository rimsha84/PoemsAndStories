package com.example.lenovo.poemsandstories;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.ArrayList;

import info.hoang8f.widget.FButton;

public class PSAdapter extends RecyclerView.Adapter<PSAdapter.MyViewHolder> {

    ArrayList<model_poem_story> arrayList= new ArrayList<>();
    Context context;

    public PSAdapter(ArrayList<model_poem_story> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.poemstory,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int i) {
        model_poem_story stories_model =arrayList.get(i);


        holder.tv.setText(stories_model.getTextview());
        holder.button.setText(stories_model.getButton());

        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, MainActivity.class);

                intent.putExtra("name", holder.tv.getText());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        FButton button;
        VideoView videoView;
        View holderview;
        TextView tv;


        public MyViewHolder(View view) {
            super(view);
            holderview =view;

            button= view.findViewById(R.id.selectbutton);
            tv= view.findViewById(R.id.storypoem);
        }
    }
}
