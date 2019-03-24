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
    public TextView evsHp;
    public TextView evsAtk;
    public TextView evsDef;
    public TextView evsSpa;
    public TextView evsSpd;
    public TextView evsSpe;
    public TextView ivsHp;
    public TextView ivsAtk;
    public TextView ivsDef;
    public TextView ivsSpa;
    public TextView ivsSpdef;
    public TextView ivsSpe;

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
        evsHp = (TextView) findViewById(R.id.evshp);
        evsAtk = (TextView) findViewById(R.id.evsatk);
        evsDef = (TextView) findViewById(R.id.evsdef);
        evsSpa = (TextView) findViewById(R.id.evsspa);
        evsSpd = (TextView) findViewById(R.id.evsspdef);
        evsSpe = (TextView) findViewById(R.id.evsspe);
        ivsHp = (TextView) findViewById(R.id.ivshp);
        ivsAtk = (TextView) findViewById(R.id.ivsatk);
        ivsDef = (TextView) findViewById(R.id.ivsdef);
        ivsSpa = (TextView) findViewById(R.id.ivsspa);
        ivsSpdef = (TextView) findViewById(R.id.ivsspdef);
        ivsSpe = (TextView) findViewById(R.id.ivsspe);

        String jsonPkmn = getIntent().getStringExtra("pkmnId");
        Gson gson = new Gson();
        Pokemon pkmn = gson.fromJson(jsonPkmn, Pokemon.class);

        species.setText(pkmn.getSpecies());
        ability.setText(pkmn.getAbility());
        nature.setText(pkmn.getNature());
        item.setText(pkmn.getItem());
        moves.setText(pkmn.getMoves());
        evsHp.setText(pkmn.getHp());
        evsAtk.setText(pkmn.getAtk());
        evsDef.setText(pkmn.getDef());
        evsSpa.setText(pkmn.getSpa());
        evsSpd.setText(pkmn.getSpdef());
        evsSpe.setText(pkmn.getSpe());
        ivsHp.setText(pkmn.getiHp());
        ivsAtk.setText(pkmn.getiAtk());
        ivsDef.setText(pkmn.getiDef());
        ivsSpa.setText(pkmn.getiSpa());
        ivsSpdef.setText(pkmn.getiSpdef());
        ivsSpe.setText(pkmn.getSpe());
    }
}
