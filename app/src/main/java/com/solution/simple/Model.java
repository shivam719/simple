package com.solution.simple;

public class Model   {

    private int image;
    private  String TextView;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTextView() {
        return TextView;
    }

    public void setTextView(String textView) {
        TextView = textView;
    }

    public Model(int image, String textView) {
        this.image = image;
        TextView = textView;


    }
}
