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
            model_poem_story stories_model =new model_poem_story("Donkey Skin","Play","aeXzYswik_Q","http://i3.ytimg.com/vi/aeXzYswik_Q/hqdefault.jpg");
            videolist.add(stories_model);
            //Mouse And Snake Story
            stories_model =new model_poem_story("Mouse and Snake","Play","bkv4gHpBG5M","http://i3.ytimg.com/vi/aeXzYswik_Q/hqdefault.jpg");
            videolist.add(stories_model);
            //salad
            stories_model =new model_poem_story("The Salad","Play","w6jGGhmwFgs","http://i3.ytimg.com/vi/w6jGGhmwFgs/hqdefault.jpg");
            videolist.add(stories_model);
            //selfish  giant
            stories_model =new model_poem_story("Selfish Giant","Play","OR24y5K9fwg","http://i3.ytimg.com/vi/OR24y5K9fwg/hqdefault.jpg");
            videolist.add(stories_model);
            //ugly duck
            stories_model =new model_poem_story("Ugly Ducklng","Play","kPfoSZFHNs4","http://i3.ytimg.com/vi/kPfoSZFHNs4/hqdefault.jpg");
            videolist.add(stories_model);
            //white snake,"Play"
            stories_model =new model_poem_story("White Snake","Play","NNdyZn_Fr78","http://i3.ytimg.com/vi/NNdyZn_Fr78/hqdefault.jpg");
            videolist.add(stories_model);
            //puss in boots
            stories_model =new model_poem_story("The Puss In The Boots","Play","AqNpEMdTDWA","http://i3.ytimg.com/vi/AqNpEMdTDWA/hqdefault.jpg");
            videolist.add(stories_model);
            //wolf ans seven goats
            stories_model =new model_poem_story("A Wolf And Seven Goats","Play","9vLOa8G0GFw","http://i3.ytimg.com/vi/9vLOa8G0GFw/hqdefault.jpg");
            videolist.add(stories_model);



        }
        if(category.equals("Poems")){
            model_poem_story stories_model =new model_poem_story("Baa Baa Blacl Sheep","Play","1dttq5p0xUM","http://i3.ytimg.com/vi/1dttq5p0xUM/hqdefault.jpg");
            videolist.add(stories_model);
            stories_model =new model_poem_story("Ding Dong Bell","Play","UduPSTwjzrM","http://i3.ytimg.com/vi/UduPSTwjzrM/hqdefault.jpg");
            videolist.add(stories_model);
            stories_model =new model_poem_story("Five little Monkeys","Play","b0NHrFNZWh0","http://i3.ytimg.com/vi/b0NHrFNZWh0/hqdefault.jpg");
            videolist.add(stories_model);
            stories_model =new model_poem_story("Jack And Jill","Play","FYojUSFfuMg","http://i3.ytimg.com/vi/FYojUSFfuMg/hqdefault.jpg");
            videolist.add(stories_model);
            stories_model =new model_poem_story("My Red Balloon","Play","ZaIu32TWX64","http://i3.ytimg.com/vi/ZaIu32TWX64/hqdefault.jpg");
            videolist.add(stories_model);
            stories_model =new model_poem_story("One Two Buckle My Shoe","Play","ad1h8fSqSzw","http://i3.ytimg.com/vi/ad1h8fSqSzw/hqdefault.jpg");
            videolist.add(stories_model);
            stories_model =new model_poem_story("Rain Rain Go Away","Play","Zu6o23Pu0Do","http://i3.ytimg.com/vi/Zu6o23Pu0Do/hqdefault.jpg");
            videolist.add(stories_model);
            stories_model =new model_poem_story("The Finger Family","Play","3xqqj9o7TgA","http://i3.ytimg.com/vi/3xqqj9o7TgA/hqdefault.jpg");
            videolist.add(stories_model);
            stories_model =new model_poem_story("Twinkle Twinkle","Play","yCjJyiqpAuU","http://i3.ytimg.com/vi/yCjJyiqpAuU/hqdefault.jpg");
            videolist.add(stories_model);
            stories_model =new model_poem_story("Vegetables","Play","DOT15xaX7-E","http://i3.ytimg.com/vi/DOT15xaX7-E/hqdefault.jpg");
            videolist.add(stories_model);


        }
        if(category.equals("STORIES")){
//Aladin
            model_poem_story stories_model =new model_poem_story("Aladin","Play","k8-VK_Cn8mc","http://i3.ytimg.com/vi/k8-VK_Cn8mc/hqdefault.jpg");
            videolist.add(stories_model);
            //
            stories_model =new model_poem_story("Ali Baba 40 Chor","Play","oSGzL508PZY","http://i3.ytimg.com/vi/oSGzL508PZY/hqdefault.jpg");
            videolist.add(stories_model);
            //
            stories_model =new model_poem_story("Junge Book","Play","bWalQ-I4JCo&list=PLw1-y09ez92AWDfdklrmtc6afFF3g8-8T&t=0s&index=11","http://i3.ytimg.com/vi/bWalQ-I4JCo/hqdefault.jpg");
            videolist.add(stories_model);
            //
            stories_model =new model_poem_story("Saat Kawye","Play","DQR5qBNQLQU&t=0s&list=PLw1-y09ez92AWDfdklrmtc6afFF3g8-8T&index=20","http://i3.ytimg.com/vi/DQR5qBNQLQU/hqdefault.jpg");
            videolist.add(stories_model);
             //
            stories_model =new model_poem_story("Jack And Beanstack","Play","QQD_kMvxgm4","http://i3.ytimg.com/vi/QQD_kMvxgm4/hqdefault.jpg");
            videolist.add(stories_model);
            //
            stories_model =new model_poem_story("Golden Bird","Play","Cmz5AzblBI4&index=14&list=PLw1-y09ez92CMF0MnSPtpNGqpVhe9bnxl&t=0s","http://i3.ytimg.com/vi/Cmz5AzblBI4/hqdefault.jpg");
            videolist.add(stories_model);
            //
            stories_model =new model_poem_story("Bandar Aur Magarmach","Play","4Ar2Bage-aY&index=11&list=PLw1-y09ez92CMF0MnSPtpNGqpVhe9bnxl&t=0s","http://i3.ytimg.com/vi/4Ar2Bage-aY/hqdefault.jpg");
            videolist.add(stories_model);
            //
            stories_model =new model_poem_story("Lion And Mouse","Play","MRnMz7cQeXo&list=PLw1-y09ez92AWDfdklrmtc6afFF3g8-8T&t=0s&index=13","http://i3.ytimg.com/vi/MRnMz7cQeXo/hqdefault.jpg");
            videolist.add(stories_model);
            //
            stories_model =new model_poem_story("Little Match Girl","Play","ojhFOuAKRmY&index=12&list=PLw1-y09ez92BuX-g9YClBGDdJIgCS-nUk&t=0s","http://i3.ytimg.com/vi/ojhFOuAKRmY/hqdefault.jpg");
            videolist.add(stories_model);

        }
        if(category.equals("POEMS")){
            model_poem_story stories_model =new model_poem_story("Chanda Mama","Play","_SrBt7Jv5qI","http://i3.ytimg.com/vi/_SrBt7Jv5qI/hqdefault.jpg");
            videolist.add(stories_model);
            stories_model =new model_poem_story("Nani Teri Morni","Play","yrynT4T55Xc","http://i3.ytimg.com/vi/yrynT4T55Xc/maxresdefault.jpg");
            videolist.add(stories_model);
            stories_model =new model_poem_story("Machli Jal Ki Rani","Play","DukYkulCT3U","http://i3.ytimg.com/vi/_SrBt7Jv5qI/hqdefault.jpg");
            videolist.add(stories_model);
            stories_model =new model_poem_story("Lakri Ki Kathi","Play","3bLfzgZ-wO8","http://i3.ytimg.com/vi/3bLfzgZ-wO8/hqdefault.jpg");
            videolist.add(stories_model);
            stories_model =new model_poem_story("Abbu Laye Motor Car","Play","k83yNjbv_Ig&t=12s","http://i3.ytimg.com/vi/k83yNjbv_Ig/hqdefault.jpg");
            videolist.add(stories_model);
            stories_model =new model_poem_story("Aalo Miyan","Play","9bQqTgCNmmI","http://i3.ytimg.com/vi/9bQqTgCNmmI/hqdefault.jpg");
            videolist.add(stories_model);
            stories_model =new model_poem_story("Tumak Tala","Play","09ZWMiQeYtE","http://i3.ytimg.com/vi/09ZWMiQeYtE/hqdefault.jpg");
            videolist.add(stories_model);
            stories_model =new model_poem_story("Teetar Aur Batair","Play","YFFtIfcahR0&t=11s","http://i3.ytimg.com/vi/YFFtIfcahR0/hqdefault.jpg");
            videolist.add(stories_model);
            stories_model =new model_poem_story("Chunna Munna","Play","MybSR9TPCuQ&t=15s","http://i3.ytimg.com/vi/MybSR9TPCuQ/hqdefault.jpg");
            videolist.add(stories_model);

//            stories_model= new model_poem_story("<iframe width=\\\"100%\\\" height=\\\"100%\\\" src=\\\"https://www.youtube.com/embed/eWEF1Zrmdow\\\" frameborder=\\\"0\\\" allowfullscreen></iframe>");
//            videolist.add(stories_model);

        }

    }
}
