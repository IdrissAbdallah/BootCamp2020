package com.company;

public abstract class Personnage extends Victime{

    public  Personnage (String n, int pdv) {
        super(n,pdv);
    }

    public String toString() {
        if (pointsDeVie >= 0){
            return "Je m'appelle " + this.Nom + " et j'ai " + this.pointsDeVie+ " points de vie.";
        } else {
            return this.Nom+" est mort.";
        }
    }

    public String getNom() {
        return this.Nom;
    }

    public int getVie() {
        return this.pointsDeVie;
    }

    public void addVie(int num) {
        this.pointsDeVie=this.pointsDeVie+num;
    }

    public abstract void attaque(Victime p);

    public abstract int subitFrappe(int coup);

    public abstract int subitCharme(int coup);


}
