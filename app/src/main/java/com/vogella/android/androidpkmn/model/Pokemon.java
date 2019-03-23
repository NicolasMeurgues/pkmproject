package com.vogella.android.androidpkmn.model;

public class Pokemon {
    private String name;
    private String item;
    private String abiltiy;
    private String nature;

    private Evs evs;
    private Ivs ivs;
    private Moves moves;



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getItem() { return item; }
    public void setItem(String item) { this.item = item; }

    public String getAbiltiy() { return abiltiy; }
    public void setAbiltiy(String abiltiy) { this.abiltiy = abiltiy; }

    public String getNature() { return nature; }
    public void setNature(String nature) { this.nature = nature; }

}
