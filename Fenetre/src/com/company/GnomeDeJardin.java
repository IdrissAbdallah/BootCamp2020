package com.company;

public class GnomeDeJardin extends NainsDeJardin implements SuperPouvoir{

    public GnomeDeJardin( String n, int s){
        super(n,s);
    }

    public double sort() { return this.pointsDeVie*Math.random(); }

    @Override
    public int subitCharme(int coup) {
        int sort= (int) this.sort();
        if (sort > coup){
            return coup;
        }else {
            return 1;
        }

    }
}
