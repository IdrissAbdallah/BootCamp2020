package com.company;

import java.awt.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        rand.nextInt(101);
        Personnage M1 = new Monstre("M1", rand.nextInt(101));
        Personnage M2 = new Monstre("M2", rand.nextInt(101));
        Personnage M3 = new Monstre("M3", rand.nextInt(101));
        Personnage M4 = new Monstre("M4", rand.nextInt(101));
        Personnage M5 = new Monstre("M5", rand.nextInt(101));
        Personnage S1 = new Sorcier("S1", rand.nextInt(101));
        Personnage S2 = new Sorcier("S2", rand.nextInt(101));
        Personnage S3 = new Sorcier("S3", rand.nextInt(101));
        Personnage S4 = new Sorcier("S4", rand.nextInt(101));
        Personnage S5 = new Magicien("S5", rand.nextInt(101));
        Personnage[] Combattants= {M1,M2,M3,M4,M5,S1,S2,S3,S4,S5};
        for (int i =0; i<10; i++){
            System.out.println(Combattants[i]);
        }
        int tour =10;
        while (tour!=0) {
            int j = rand.nextInt(10);
            if (!Combattants[j].mort() && Combattants[j] instanceof Personnage){
                int k = rand.nextInt(10);
                if (!Combattants[j].mort() && k!=j){
                    Combattants[j].attaque(Combattants[k]);
                    tour=tour-1;
                if (Combattants[j] instanceof SuperPouvoir && Combattants[k] instanceof SuperPouvoir) {
                    for (int i = 0; i < 10; i++) {
                        if (!(Combattants[i] instanceof SuperPouvoir) && Combattants[i] instanceof Personnage) {
                            Combattants[i].addVie(-1);
                            }
                        }
                    }
                }
            }
        }
        for (int i =0; i<10; i++){
            System.out.println(Combattants[i]);
        }
    }
}