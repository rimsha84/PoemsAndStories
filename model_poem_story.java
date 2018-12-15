package com.example.lenovo.poemsandstories;

public class model_poem_story {
    String textview;
    String button;
    int video;

    public model_poem_story() {

    }

    public model_poem_story(int video,String textview, String button) {
        this.video= video;
        this.textview = textview;
        this.button = button;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }

    public String getTextview() {
        return textview;
    }

    public void setTextview(String textview) {
        this.textview = textview;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }
}
