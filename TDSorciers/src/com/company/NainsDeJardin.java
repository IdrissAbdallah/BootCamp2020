package com.company;

public class NainsDeJardin extends Victime{
    protected int solidite;

    public NainsDeJardin(String n, int s){
        super(n);
        this.solidite=s;
    }

    public int subitFrappe(int coup){
        if (coup > this.solidite) {
            int retour= this.solidite;
            this.solidite=0;
            return retour;
        } else {
            return coup;
        }
    }

    public int subitCharme(int coup){
        return 1;
    }

}
