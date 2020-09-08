package com.company;

public class Monstre extends Personnage{

    public Monstre(String n, int pdv) {
        super(n, pdv);
    }

    public void attaque(Personnage p){
        if (!(this.mort())) {
            int degats = this.pointsDeVie/2;
            this.pointsDeVie=this.pointsDeVie-p.subitFrappe(degats);
        }
    }

     public int subitFrappe(int coup){
        this.pointsDeVie=this.pointsDeVie-coup;
        return this.pointsDeVie/2;
    }

    public int subitCharme(int coup){
        this.pointsDeVie=this.pointsDeVie-coup;
        return -this.pointsDeVie/2;

    }
}
