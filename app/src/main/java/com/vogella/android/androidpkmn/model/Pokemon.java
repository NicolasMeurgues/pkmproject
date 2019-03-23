package com.vogella.android.androidpkmn.model;

public class Pokemon {
    private String species;
    private String[] item;
    private String[] ability;
    private String nature;

    private Evs evs;
    private Ivs ivs;
    private Moves moves;



    public String getSpecies() {
        return species;
    }
    public void setName(String species) {
        this.species = species;
    }

    public String[] getItem() { return item; }
    public void setItem(String[] item) { this.item = item; }

    public String[] getAbility() { return ability; }
    public void setAbility(String[] ability) { this.ability = ability; }

    public String getNature() { return nature; }
    public void setNature(String nature) { this.nature = nature; }
    
    public Pokemon(String species, String[] item, String[] ability, String nature){
        this.species = species;
        this.item = item;
        this.ability = ability;
        this.nature = nature;
    }

}
