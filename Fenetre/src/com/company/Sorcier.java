package com.company;

public class Sorcier extends Personnage {
    protected double pouvoir;

    public Sorcier(String n,int pdv){
        super(n,pdv);
        this.pouvoir= Math.random();
    }

    public void attaque(Victime p) {
        if (!(this.mort())) {
            int degats = this.pointsDeVie / 2;
            this.pointsDeVie = this.pointsDeVie - p.subitCharme(degats);
        }
    }

    public int subitFrappe(int coup) {
        this.pointsDeVie = this.pointsDeVie - coup;
        double p = this.pointsDeVie;
        double res = - p * this.pouvoir;
        int value = (int) Math.round(res);
        return (int) res;
    }

    public int subitCharme(int coup) {
        return 0;
    }

}
