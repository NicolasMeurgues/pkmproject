package com.vogella.android.androidpkmn.model;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.List;

import static java.lang.String.valueOf;

public class Pokemon {
    private String species;
    private String[] item;
    private String[] ability;
    private String nature;
    private String[][] moves;

    private int hp=0;
    private int atk=0;
    private int def=0;
    private int spa=0;
    private int spdef=0;
    private int spe=0;

    private int ihp=31;
    private int iatk=31;
    private int idef=31;
    private int ispa=31;
    private int ispdef=31;
    private int ispe=31;

    public String getiHp() { return String.valueOf(ihp); }
    public void setiHp(int hp) { this.ihp = hp; }

    public String getiAtk() { return String.valueOf(iatk); }
    public void setiAtk(int atk) { this.iatk = atk; }

    public String getiDef() { return String.valueOf(idef); }
    public void setiDef(int def) { this.idef = def; }

    public String getiSpa() { return String.valueOf(ispa); }
    public void setiSpa(int spa) { this.ispa = spa; }

    public String getiSpdef() { return String.valueOf(ispdef); }
    public void setiSpdef(int spdef) { this.ispdef = spdef; }

    public String getiSpe() { return String.valueOf(ispe); }
    public void setiSpe(int spe) { this.ispe = spe; }


    public String getHp() { return String.valueOf(hp); }
    public void setHp(int hp) { this.hp = hp; }

    public String getAtk() { return String.valueOf(atk); }
    public void setAtk(int atk) { this.atk = atk; }

    public String getDef() { return String.valueOf(def); }
    public void setDef(int def) { this.def = def; }

    public String getSpa() { return String.valueOf(spa); }
    public void setSpa(int spa) { this.spa = spa; }

    public String getSpdef() { return String.valueOf(spdef); }
    public void setSpdef(int spdef) { this.spdef = spdef; }

    public String getSpe() { return String.valueOf(spe); }
    public void setSpe(int spe) { this.spe = spe; }


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

    //TODO faire class evs et ivs ou se débrouiller pour recup les infos d'un objet json dans cette classe

    public Pokemon(String species, String[] item, String[] ability, String nature, int hp, int atk, int def, int spa, int spdef, int spe, int ihp, int iatk, int idef, int ispa, int ispdef, int ispe){
        this.species = species;
        this.item = item;
        this.ability = ability;
        this.nature = nature;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spa = spa;
        this.spdef = spdef;
        this.spe = spe;
        this.ihp = ihp;
        this.iatk = iatk;
        this.idef = idef;
        this.ispa = ispa;
        this.ispdef = ispdef;
        this.ispe = ispe;
    }
}
