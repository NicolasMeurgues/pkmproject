package com.vogella.android.androidpkmn.data;

import com.vogella.android.androidpkmn.model.Pokemon;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;



public interface PkmnAPI {
    @GET("pkmn.json")
    Call<List<Pokemon>> getListPokemon();
}
