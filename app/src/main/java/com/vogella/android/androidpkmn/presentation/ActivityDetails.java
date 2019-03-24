package com.vogella.android.androidpkmn.presentation;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;
import com.vogella.android.androidpkmn.R;
import com.vogella.android.androidpkmn.model.Pokemon;

class ActivityDetails extends Activity {
    public TextView species;
    public TextView nature;
    public TextView ability;
    public TextView item;
    public TextView moves;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitydetails);

        //TODO lien xml et variables à faire
         species = (TextView) findViewById(R.id.speciestxt);
         ability = (TextView) findViewById(R.id.abilitytxt);

        String jsonPkmn = getIntent().getStringExtra("pkmnID");
        Gson gson = new Gson();
        Pokemon pkmn = gson.fromJson(jsonPkmn, Pokemon.class);

        //TODO reprendre les getters pour donner les infos
        species.setText(pkmn.getSpecies());
    }
}
