package com.example.lenovo.poemsandstories;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.squareup.picasso.Picasso;

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

        final String ijk= stories_model.getUri();
        Picasso.get().load(stories_model.getIuri()).into(holder.imageView);

        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + ijk));
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.youtube.com/watch?v=" + ijk));
                try {
                    context.startActivity(appIntent);
                } catch (ActivityNotFoundException ex) {
                    Log.e(ActivityNotFoundException.class.getSimpleName(), ex.getLocalizedMessage());
                    context.startActivity(webIntent);
                }

            }


        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        FButton button;
        ImageView imageView;
        View holderview;
        TextView tv;


        public MyViewHolder(View view) {
            super(view);
            holderview =view;
            imageView= view.findViewById(R.id.imageview);
            button= view.findViewById(R.id.selectbutton);
            tv= view.findViewById(R.id.storypoem);
        }
    }
}
