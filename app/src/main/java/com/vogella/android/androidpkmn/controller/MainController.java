package com.vogella.android.androidpkmn.controller;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.vogella.android.androidpkmn.data.PkmnAPI;
import com.vogella.android.androidpkmn.model.Pokemon;
import com.vogella.android.androidpkmn.presentation.MainActivity;

import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainController {


    private final MainActivity activity;
    private static final String BASE_URL = "https://nicolasmeurgues.github.io/pkmnOUAPI/";

    public MainController(MainActivity mainActivity) {
        this.activity = mainActivity;
    }

    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstance(){
        if (retrofit == null){
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public void onCreate() {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        final SharedPreferences pkmnCache = PreferenceManager.getDefaultSharedPreferences(activity);
        final SharedPreferences.Editor editor = pkmnCache.edit();

        PkmnAPI api = retrofit.create(PkmnAPI.class);

        Call<List<Pokemon>> call = api.getListPokemon();
        call.enqueue(new Callback<List<Pokemon>>() {
            @Override
            public void onResponse(Call<List<Pokemon>> call, Response<List<Pokemon>> response) {
                List<Pokemon> input = response.body();
                if (input == null) {
                    System.out.println("my response body is null!!");
                    return;
                }
                Gson gson = new Gson();
                String json = gson.toJson(input);
                editor.putString("pkmnCache", json);
                editor.apply();
                activity.showList(input);
            }

            @Override
            public void onFailure(Call<List<Pokemon>> call, Throwable t) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(activity);
                Gson gson = new Gson();
                String json = preferences.getString("pkmnCache", null);
                Type type = new TypeToken<List<Pokemon>>() {}.getType();
                List<Pokemon> input = gson.fromJson(json, type);

                if (input == null) {
                    System.out.println(call);
                    System.out.println(t);
                    System.out.println("onFailure response body is null!!");
                    return;
                }

                activity.showList(input);
            }
        });
    }
}
