package com.example.lenovo.poemsandstories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import info.hoang8f.widget.FButton;

public class Category_choice extends AppCompatActivity {
    RelativeLayout layout1,layout2;
    FButton engStory,engPoem,urdustories,urdupoems;
    String language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_choice);

        layout1= findViewById(R.id.englishlayout);
        layout2= findViewById(R.id.urdulayout);

        engStory=findViewById(R.id.englishstorybutton);
        engPoem=findViewById(R.id.engpoembutton);

        urdustories=findViewById(R.id.urdustoriesbutton);
        urdupoems=findViewById(R.id.urdupoembutton);

        language= getIntent().getExtras().getString("name");

        if(language.equals("English")){
            layout1.setVisibility(View.VISIBLE);
        }


        engStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Category_choice.this, "eng stories", Toast.LENGTH_SHORT).show();
                Intent engstory =new Intent(Category_choice.this, Stories_Poems.class);
                engstory.putExtra("choice",engStory.getText());
                startActivity(engstory);

            }
        });
        engPoem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Category_choice.this, "eng poems", Toast.LENGTH_SHORT).show();
                Intent engpoems =new Intent(Category_choice.this, Stories_Poems.class);
                engpoems.putExtra("choice",engPoem.getText());
                startActivity(engpoems);

            }
        });
        if(language.equals("Urdu")){
            layout2.setVisibility(View.VISIBLE);
        }

        urdustories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Category_choice.this, "urdu stories", Toast.LENGTH_SHORT).show();
                Intent urdustory =new Intent(Category_choice.this, Stories_Poems.class);
                urdustory.putExtra("choice",urdustories.getText());
                startActivity(urdustory);


            }
        });
        urdupoems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Category_choice.this, "urdu poems", Toast.LENGTH_SHORT).show();
                Intent urdupoem =new Intent(Category_choice.this, Stories_Poems.class);
                urdupoem.putExtra("choice",urdupoems.getText());
                startActivity(urdupoem);

            }
        });

    }
}
