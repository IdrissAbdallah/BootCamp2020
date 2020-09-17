package com.company;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;
import javax.swing.JLabel;

public class Ardoise extends JPanel {
    static final long serialVersionUID = 1;
    public Victime[] combattants;
    public JLabel[] etiquettes;
    public int longueur;

    public Ardoise(Victime[] combattants, int n,JLabel[] etiquettes) {
        this.combattants=combattants;
        this.longueur=n;
        this.etiquettes=etiquettes;
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(1200, 100));
    }

    public void dessiner(JFrame cadre) {
        for (int i=0;i<this.longueur;i++){
            String pdv=Integer.toString(this.combattants[i].pointsDeVie);
            String nom=this.combattants[i].Nom;
            if (this.combattants[i].mort()){
                pdv="Mort";
            }
            this.etiquettes[i].setText("/  "+nom+" : "+pdv+"  /");
            cadre.add(this.etiquettes[i], BorderLayout.SOUTH);
        }
    }
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }

    public String attaque(){
        String res= "Il ne se passe rien";
        Random rand = new Random();
        int t=1;
        while (t!=0) {
            int j = rand.nextInt(10);
            if (!(this.combattants[j].mort()) && this.combattants[j] instanceof Personnage) {
                int k = rand.nextInt(10);
                if (!(this.combattants[k].mort()) && k != j) {
                    this.combattants[j].attaque(this.combattants[k]);
                    res = this.combattants[j].getNom() + " attaque " + this.combattants[k].getNom();
                    t=0;
                    if (this.combattants[j] instanceof SuperPouvoir && this.combattants[k] instanceof SuperPouvoir) {
                        for (int i = 0; i < 10; i++) {
                            if (!(this.combattants[i] instanceof SuperPouvoir) && this.combattants[i] instanceof Personnage) {
                                this.combattants[i].addVie(-1);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}
