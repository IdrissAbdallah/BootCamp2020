package com.company;

public class Magicien extends Sorcier implements SuperPouvoir{

    public Magicien (String n, int pdv) {
        super(n,pdv);
        this.pouvoir=Math.random()*this.extra;
    }

    public void attaque(Personnage p) {
        if (!(this.mort())) {
            int degats = this.pointsDeVie / 2;
            this.pointsDeVie = this.pointsDeVie - p.subitCharme(degats);
        }
    }

    public int subitCharme(int coup) {
        double res = - coup *this.sort();
        return (int) res;
    }

    public double sort(){return this.pouvoir*Math.random(); }
}
