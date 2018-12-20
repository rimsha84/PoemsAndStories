package com.example.lenovo.poemsandstories;

public class model_poem_story {
    String textview;
    String button;
    String uri,iuri;

    public model_poem_story() {

    }

    public model_poem_story( String textview, String button, String uri, String iuri) {
        this.textview = textview;
        this.button = button;
        this.uri = uri;
        this.iuri = iuri;
    }

//    public int getVideo() {
//        return video;
//    }
//
//    public void setVideo(int video) {
//        this.video = video;
//    }


    public String getIuri() {
        return iuri;
    }

    public void setIuri(String iuri) {
        this.iuri = iuri;
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

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
