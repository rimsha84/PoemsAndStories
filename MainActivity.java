package com.example.lenovo.poemsandstories;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoplayer;
    MediaController mc;
    Uri uri;
    String path,name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoplayer=findViewById(R.id.videoplayer);
        MediaController mediaController= new MediaController(this);

        name= getIntent().getExtras().getString("name");
//        if (name.equals("Baa Baa Blacl Sheep")){
//        path="android.resource://"+getPackageName()+"/"+R.raw.baabaablacksheep;
//        }
//        if (name.equals("Ding Dong Bell")){
//        path="android.resource://"+getPackageName()+"/"+R.raw.dingdong_bell;
//        }
//        if (name.equals("Five little Monkeys")){
//        path="android.resource://"+getPackageName()+"/"+R.raw.five_little_monkey;
//        }
//        if (name.equals("Jack And Jill")){
//        path="android.resource://"+getPackageName()+"/"+R.raw.jack_and_jill;
//        }
//        if (name.equals("My Red Balloon")){
//        path="android.resource://"+getPackageName()+"/"+R.raw.my_redballoon;
//        }
//        if (name.equals("One Two Buckle My Shoe")){
//        path="android.resource://"+getPackageName()+"/"+R.raw.one_two;
//        }
//        if (name.equals("Rain Rain Go Away")){
//        path="android.resource://"+getPackageName()+"/"+R.raw.rainrain;
//        }
//        if (name.equals("The Finger Family")){
//        path="android.resource://"+getPackageName()+"/"+R.raw.the_finger_family;
//        }
//        if (name.equals("Twinkle Twinkle")){
//        path="android.resource://"+getPackageName()+"/"+R.raw.twinkletwinkle;
//        }
//        if (name.equals("Vegetables")){
//        path="android.resource://"+getPackageName()+"/"+R.raw.vegetable;
//        }
//
//        if (name.equals("Ali Baba 40 Chor")){
//        path="android.resource://"+getPackageName()+"/"+R.raw.ali_baba_aurchaleeschor;
//        }
//        if (name.equals("Junge Book")){
//        path="android.resource://"+getPackageName()+"/"+R.raw.junglebook;
//        }
//        if (name.equals("Saat Kawye")){
//        path="android.resource://"+getPackageName()+"/"+R.raw.saat_kawye;
//        }
//        if (name.equals("Jack And Beanstack")){
//        path="android.resource://"+getPackageName()+"/"+R.raw.jack_and_beanstalk;
//        }
//        if (name.equals("Golden Bird")){
//        path="android.resource://"+getPackageName()+"/"+R.raw.thegolden_bird;
//        }
//        if (name.equals("Bandar Aur Magarmach")){
//        path="android.resource://"+getPackageName()+"/"+R.raw.bandar_aur_magarmach;
//        }
//        if (name.equals("Lion And Mouse")){
//        path="android.resource://"+getPackageName()+"/"+R.raw.sher_chooha;
//        }
//        if (name.equals("Little Match Girl")){
//        path="android.resource://"+getPackageName()+"/"+R.raw.littlematchgirl;
//        }
//        if (name.equals("Chanda Mama")){
//            path="android.resource://"+getPackageName()+"/"+R.raw.chanda_mama;
//        }
//        if (name.equals("Nani Teri Morni")){
//            path="android.resource://"+getPackageName()+"/"+R.raw.nani_teri_morni;
//        }
//        if (name.equals("Machli Jal Ki Rani")){
//            path="android.resource://"+getPackageName()+"/"+R.raw.machli_jal_ki;
//        }
//        if (name.equals("Lakri Ki Kathi")){
//            path="android.resource://"+getPackageName()+"/"+R.raw.lakri_ki_kathi;
//        }
//        if (name.equals("Aalo Miyan")){
//            path="android.resource://"+getPackageName()+"/"+R.raw.aalomiyan;
//        }
//        if (name.equals("Abbu Laye Motor Car")){
//            path="android.resource://"+getPackageName()+"/"+R.raw.abbulaye;
//        }
//        if (name.equals("Tumak Tala")){
//            path="android.resource://"+getPackageName()+"/"+R.raw.tumaktala;
//        }
//        if (name.equals("Teetar Aur Batair")){
//            path="android.resource://"+getPackageName()+"/"+R.raw.ekteetar;
//        }
//        if (name.equals("Chunna Munna")){
//            path="android.resource://"+getPackageName()+"/"+R.raw.chunnamunna;
//        }
//        if (name.equals("Donkey Skin")){
//            path="android.resource://"+getPackageName()+"/"+R.raw.donkey_skin;
//        }
//        if (name.equals("Mouse and Snake")){
//            path="android.resource://"+getPackageName()+"/"+R.raw.mouseandsnake;
//        }
//        if (name.equals("The Salad")){
//            path="android.resource://"+getPackageName()+"/"+R.raw.salad;
//        }
//        if (name.equals("Selfish Giant")){
//            path="android.resource://"+getPackageName()+"/"+R.raw.selfishgiant;
//        }
//        if (name.equals("Ugly Ducklng")){
//            path="android.resource://"+getPackageName()+"/"+R.raw.ugly_duckling;
//        }
//        if (name.equals("White Snake")){
//            path="android.resource://"+getPackageName()+"/"+R.raw.the_white_snake;
//        }
//        if (name.equals("The Puss In The Boots")){
//            path="android.resource://"+getPackageName()+"/"+R.raw.pussinboots;
//        }
//        if (name.equals("A Wolf And Seven Goats")){
//            path="android.resource://"+getPackageName()+"/"+R.raw.wolf_and_goats;
//        }



        if (name.equals("Aladin")){
            path="k8-VK_Cn8mc";
        }
//        uri=Uri.parse(path);
//        videoplayer.setVideoPath(path);
//        mediaController.setAnchorView(videoplayer);
//        videoplayer.setMediaController(mediaController);
//        videoplayer.requestFocus();
//        videoplayer.start();

          }
    public void watchYoutubeVideo(Context context, String id){
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + path));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=" + id));
        try {
            context.startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            Log.e(ActivityNotFoundException.class.getSimpleName(), ex.getLocalizedMessage());
            context.startActivity(webIntent);
        }
    }

}
