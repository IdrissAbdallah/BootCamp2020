package com.company;

public abstract class Victime {
    public String Nom;
    public int pointsDeVie;

    public Victime(String n,int pdv) {
        this.Nom=n;
        this.pointsDeVie=pdv;
    }

    public boolean mort() {
        return (this.pointsDeVie <= 0);
    }

    public abstract int subitFrappe(int coup);

    public abstract int subitCharme(int coup);

    public abstract void attaque(Victime victime);

    public abstract void addVie(int n);

    public abstract String getNom();
}
