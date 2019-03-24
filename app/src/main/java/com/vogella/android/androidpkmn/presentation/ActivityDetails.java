package com.vogella.android.androidpkmn.presentation;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.widget.TextView;

import com.google.gson.Gson;
import com.vogella.android.androidpkmn.R;
import com.vogella.android.androidpkmn.model.Pokemon;

public class ActivityDetails extends Activity {
    public TextView species;
    public TextView nature;
    public TextView ability;
    public TextView item;
    public TextView moves;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitydetails);

        species = (TextView) findViewById(R.id.speciestxt);
        ability = (TextView) findViewById(R.id.abilitytxt);
        nature = (TextView) findViewById(R.id.naturetxt);
        item = (TextView) findViewById(R.id.itemtxt);
        moves = (TextView) findViewById(R.id.movestxt);

        String jsonPkmn = getIntent().getStringExtra("pkmnId");
        Gson gson = new Gson();
        Pokemon pkmn = gson.fromJson(jsonPkmn, Pokemon.class);

        species.setText(pkmn.getSpecies());
        ability.setText(pkmn.getAbility());
        nature.setText(pkmn.getNature());
        item.setText(pkmn.getItem());
        moves.setText(pkmn.getMoves());
    }
}
