package com.example.lenovo.poemsandstories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import info.hoang8f.widget.FButton;

public class Language_choice extends AppCompatActivity {
    FButton english,urdu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_choice);

        english=findViewById(R.id.englishbutton);
        urdu=findViewById(R.id.urdubutton);

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Language_choice.this,Category_choice.class);
                intent.putExtra("name",english.getText());
                startActivity(intent);
            }
        });

        urdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Language_choice.this,Category_choice.class);
                intent.putExtra("name",urdu.getText());

                startActivity(intent);
            }
        });

    }
}
