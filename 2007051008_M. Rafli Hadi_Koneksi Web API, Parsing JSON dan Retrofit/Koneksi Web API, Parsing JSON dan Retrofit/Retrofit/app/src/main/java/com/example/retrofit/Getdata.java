package com.example.retrofit;

import com.google.gson.annotations.SerializedName;

//kelas ini akan menjadi template untuk data yang akan kita parsing

public class Getdata {

    private int id;
    private int userid;
    private String title;

    @SerializedName("body")
    private String text;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
