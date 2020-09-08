package com.company;

public abstract class Victime {
    protected String Nom;

    public Victime(String n) {
        this.Nom=n;
    }

    public abstract int subitFrappe(int coup);

    public abstract int subitCharme(int coup);
}
