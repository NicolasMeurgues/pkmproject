package com.vogella.android.androidpkmn.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vogella.android.androidpkmn.presentation.MainActivity;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainController {


    private final MainActivity activity;

    public MainController(MainActivity mainActivity) {
        this.activity = mainActivity;
    }

    public void onStart() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/Zarel/Pokemon-Showdown/master/data/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }
}
