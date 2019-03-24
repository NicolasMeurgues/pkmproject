package com.vogella.android.androidpkmn.model;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.List;

public class Pokemon {
    private String species;
    private String[] item;
    private String[] ability;
    private String nature;

    private Evs evs;
    private Ivs ivs;
    private String[][] moves;



    public String getSpecies() {
        return species;
    }
    public void setName(String species) {
        this.species = species;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public String getItem() {
        String items = String.join(",", item);
        return items; }
    public void setItem(String[] item) { this.item = item; }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public String getAbility() {
        String abilities = String.join(",", ability);
        return abilities; }
    public void setAbility(String[] ability) { this.ability = ability; }

    public String getNature() { return nature; }
    public void setNature(String nature) { this.nature = nature; }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public String getMoves() {
        String move = "";
        for (String[] movesi : moves) {
            move += String.join(",", movesi)+"\n"; //concat -> stringBuilder
        }
        return move;
    }
    public void setMoves(String[][] moves) {
        this.moves = moves;
    }

    public Pokemon(String species, String[] item, String[] ability, String nature){
        this.species = species;
        this.item = item;
        this.ability = ability;
        this.nature = nature;
    }
}
