package com.example.lenovo.poemsandstories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Stories_Poems extends AppCompatActivity {
    ArrayList<model_poem_story> videolist =new ArrayList<>();
    PSAdapter adapter;
    RecyclerView recyclerView;
    String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories__poems);

        prepareData();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter= new PSAdapter(videolist,this);
        recyclerView.setAdapter(adapter);
    }

    private void prepareData() {
        category= getIntent().getExtras().getString("choice");

        if(category.equals("Stories")){
            //donkey skin
            model_poem_story stories_model =new model_poem_story(R.raw.donkey_skin,"Donkey Skin","Play");
            videolist.add(stories_model);
            //Mouse And Snake Story
            stories_model =new model_poem_story(R.raw.mouseandsnake,"Mouse and Snake","Play");
            videolist.add(stories_model);
            //salad
            stories_model =new model_poem_story(R.raw.salad,"The Salad","Play");
            videolist.add(stories_model);
            //selfish  giant
            stories_model =new model_poem_story(R.raw.selfishgiant,"Selfish Giant","Play");
            videolist.add(stories_model);
            //ugly duck
            stories_model =new model_poem_story(R.raw.ugly_duckling,"Ugly Ducklng","Play");
            videolist.add(stories_model);
            //white snake,"Play"
            stories_model =new model_poem_story(R.raw.the_white_snake,"White Snake","Play");
            videolist.add(stories_model);
            //puss in boots
            stories_model =new model_poem_story(R.raw.pussinboots,"The Puss In The Boots","Play");
            videolist.add(stories_model);
            //wolf ans seven goats
            stories_model =new model_poem_story(R.raw.wolf_and_goats,"A Wolf And Seven Goats","Play");
            videolist.add(stories_model);



        }
        if(category.equals("Poems")){
            model_poem_story stories_model =new model_poem_story(R.raw.baabaablacksheep,"Baa Baa Blacl Sheep","Play");
            videolist.add(stories_model);
            stories_model =new model_poem_story(R.raw.dingdong_bell,"Ding Dong Bell","Play");
            videolist.add(stories_model);
            stories_model =new model_poem_story(R.raw.five_little_monkey,"Five little Monkeys","Play");
            videolist.add(stories_model);
            stories_model =new model_poem_story(R.raw.jack_and_jill,"Jack And Jill","Play");
            videolist.add(stories_model);
            stories_model =new model_poem_story(R.raw.my_redballoon,"My Red Balloon","Play");
            videolist.add(stories_model);
            stories_model =new model_poem_story(R.raw.one_two,"One Two Buckle My Shoe","Play");
            videolist.add(stories_model);
            stories_model =new model_poem_story(R.raw.rainrain,"Rain Rain Go Away","Play");
            videolist.add(stories_model);
            stories_model =new model_poem_story(R.raw.the_finger_family,"The Finger Family","Play");
            videolist.add(stories_model);
            stories_model =new model_poem_story(R.raw.twinkletwinkle,"Twinkle Twinkle","Play");
            videolist.add(stories_model);
            stories_model =new model_poem_story(R.raw.vegetable,"Vegetables","Play");
            videolist.add(stories_model);


        }
        if(category.equals("STORIES")){
//Aladin
            model_poem_story stories_model =new model_poem_story(R.raw.aladdin_and_the_magic_lamp,"Aladin","Play");
            videolist.add(stories_model);
            //
            stories_model =new model_poem_story(R.raw.ali_baba_aurchaleeschor,"Ali Baba 40 Chor","Play");
            videolist.add(stories_model);
            //
            stories_model =new model_poem_story(R.raw.junglebook,"Junge Book","Play");
            videolist.add(stories_model);
            //
            stories_model =new model_poem_story(R.raw.saat_kawye,"Saat Kawye","Play");
            videolist.add(stories_model);
             //
            stories_model =new model_poem_story(R.raw.jack_and_beanstalk,"Jack And Beanstack","Play");
            videolist.add(stories_model);
            //
            stories_model =new model_poem_story(R.raw.thegolden_bird,"Golden Bird","Play");
            videolist.add(stories_model);
            //
            stories_model =new model_poem_story(R.raw.bandar_aur_magarmach,"Bandar Aur Magarmach","Play");
            videolist.add(stories_model);
            //
            stories_model =new model_poem_story(R.raw.sher_chooha,"Lion And Mouse","Play");
            videolist.add(stories_model);
            //
            stories_model =new model_poem_story(R.raw.littlematchgirl,"Little Match Girl","Play");
            videolist.add(stories_model);

        }
        if(category.equals("POEMS")){
            model_poem_story stories_model =new model_poem_story(R.raw.chanda_mama,"Chanda Mama","Play");
            videolist.add(stories_model);
            stories_model =new model_poem_story(R.raw.nani_teri_morni,"Nani Teri Morni","Play");
            videolist.add(stories_model);
            stories_model =new model_poem_story(R.raw.machli_jal_ki,"Machli Jal Ki Rani","Play");
            videolist.add(stories_model);
            stories_model =new model_poem_story(R.raw.lakri_ki_kathi,"Lakri Ki Kathi","Play");
            videolist.add(stories_model);
            stories_model =new model_poem_story(R.raw.abbulaye,"Abbu Laye Motor Car","Play");
            videolist.add(stories_model);
            stories_model =new model_poem_story(R.raw.aalomiyan,"Aalo Miyan","Play");
            videolist.add(stories_model);
            stories_model =new model_poem_story(R.raw.tumaktala,"Tumak Tala","Play");
            videolist.add(stories_model);
            stories_model =new model_poem_story(R.raw.ekteetar,"Teetar Aur Batair","Play");
            videolist.add(stories_model);
            stories_model =new model_poem_story(R.raw.chunnamunna,"Chunna Munna","Play");
            videolist.add(stories_model);

//            stories_model= new model_poem_story("<iframe width=\\\"100%\\\" height=\\\"100%\\\" src=\\\"https://www.youtube.com/embed/eWEF1Zrmdow\\\" frameborder=\\\"0\\\" allowfullscreen></iframe>");
//            videolist.add(stories_model);

        }

    }
}
