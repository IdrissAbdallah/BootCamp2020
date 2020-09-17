package com.company;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] arg) {
        Random rand = new Random();
        Victime M1 = new Monstre("M1", rand.nextInt(101));
        Victime M2 = new Monstre("M2", rand.nextInt(101));
        Victime M3 = new Monstre("M3", rand.nextInt(101));
        Victime M4 = new NainsDeJardin("N", rand.nextInt(101));
        Victime M5 = new GnomeDeJardin("G", rand.nextInt(101));
        Victime S1 = new Sorcier("S1", rand.nextInt(101));
        Victime S2 = new Sorcier("S2", rand.nextInt(101));
        Victime S3 = new Sorcier("S3", rand.nextInt(101));
        Victime S4 = new Sorcier("S4", rand.nextInt(101));
        Victime S5 = new Magicien("M", rand.nextInt(101));
        Victime[] combattants= {M1,M2,M3,M4,M5,S1,S2,S3,S4,S5};
        JLabel lbl1=new JLabel();
        JLabel lbl2=new JLabel();
        JLabel lbl3=new JLabel();
        JLabel lbl4=new JLabel();
        JLabel lbl5=new JLabel();
        JLabel lbl6=new JLabel();
        JLabel lbl7=new JLabel();
        JLabel lbl8=new JLabel();
        JLabel lbl9=new JLabel();
        JLabel lbl10=new JLabel();
        JLabel[] etiquettes={lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10};
        JFrame cadre = new javax.swing.JFrame("Un disque");
        Ardoise ardoise=new Ardoise(combattants,10,etiquettes);
        cadre.setContentPane(ardoise);
        Bouton bouton=new Bouton(ardoise,cadre);
        cadre.add(bouton,BorderLayout.SOUTH);
        cadre.pack();
        cadre.setVisible(true);
        cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ardoise.dessiner(cadre);
    }
}



