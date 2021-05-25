package com.example.demo_2.entity.common;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.bumptech.glide.RequestManager;

public class AppData {
    private static AppData instance;
    //private final RequestManager glide;

    public static AppData getInstance(Context context) {
        if (instance == null)
            instance = new AppData(context.getApplicationContext());
        return instance;
    }


    public RequestQueue queue;// проверь подключение библиотеки
    public AppData(Context context ){
        //queue= Volley.newRequestQueue(context);
       // glide= Glide.with(context);
    }
}
