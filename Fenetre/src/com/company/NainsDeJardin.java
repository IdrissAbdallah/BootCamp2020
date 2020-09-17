package com.company;

public class NainsDeJardin extends Victime{

    public NainsDeJardin(String n, int pdv){
        super(n,pdv);
    }

    public int subitFrappe(int coup){
        if (coup > this.pointsDeVie) {
            int retour= this.pointsDeVie;
            this.pointsDeVie=0;
            return retour;
        } else {
            return coup;
        }
    }

    public int subitCharme(int coup){
        return 1;
    }

    public void attaque(Victime v){};

    public void addVie(int n){};

    public String getNom(){
     return this.Nom;
    }
}
