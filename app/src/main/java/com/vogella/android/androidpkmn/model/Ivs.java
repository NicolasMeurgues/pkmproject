package com.vogella.android.androidpkmn.model;

class Ivs {
    private int ihp=31;
    private int iatk=31;
    private int idef=31;
    private int ispa=31;
    private int ispdef=31;
    private int ispe=31;

    public int getiHp() { return ihp; }
    public void setiHp(int hp) { this.ihp = hp; }

    public int getiAtk() { return iatk; }
    public void setiAtk(int atk) { this.iatk = atk; }

    public int getiDef() { return idef; }
    public void setiDef(int def) { this.idef = def; }

    public int getiSpa() { return ispa; }
    public void setiSpa(int spa) { this.ispa = spa; }

    public int getiSpdef() { return ispdef; }
    public void setiSpdef(int spdef) { this.ispdef = spdef; }

    public int getiSpe() { return ispe; }
    public void setiSpe(int spe) { this.ispe = spe; }
}