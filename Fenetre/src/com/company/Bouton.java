package com.company;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class Bouton extends JPanel implements ActionListener {
    private JButton attaque = new JButton("Attaque");
    private Ardoise  ardoise ;
    private JFrame cadre;
    private JLabel texte=new JLabel();

    public Bouton(Ardoise ardoise,JFrame cadre) {
        this.ardoise=ardoise;
        this.cadre=cadre;
        setLayout(new BorderLayout(5, 5));
        this.ardoise.add(attaque);
        attaque.addActionListener(this);
        this.ardoise.add(texte);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == attaque);
        this.texte.setText(ardoise.attaque());
        ardoise.dessiner(cadre);
    }
}