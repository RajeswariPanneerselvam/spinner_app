package com.app.countryspinnertestapp;

import android.app.Application;

import java.util.ArrayList;

public class AppController extends Application {

    static AppController mInstance;

    public static AppController getInstance() {
        if (mInstance == null) {
            mInstance = new AppController();
        }
        return mInstance;
    }

    ArrayList<String>arrayList=new ArrayList<>();

}
