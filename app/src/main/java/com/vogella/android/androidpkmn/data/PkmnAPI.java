package com.vogella.android.androidpkmn.data;


import com.vogella.android.androidpkmn.model.PkmnResponse;

import retrofit2.Call;
import retrofit2.http.GET;



public interface PkmnAPI {
    @GET("bss-factory-sets.json")
    Call<PkmnResponse> getListPokemon();
}
