package com.company;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Font;

public class Dialogue extends JPanel{
    JTextArea grandeZone = new JTextArea(4, 10);
    public Dialogue() {
        JLabel taille = new JLabel(" Actions : ");
        JScrollPane texteAsc;
        JPanel panneauTaille = new JPanel();
        Font fonte;
        int tailleInitiale = 20;

        panneauTaille.setLayout(new BorderLayout(5, 5));
        panneauTaille.add(taille, BorderLayout.CENTER);

        fonte = new Font("TimesRoman", Font.PLAIN, tailleInitiale);
        grandeZone.setFont(fonte);
        texteAsc = new JScrollPane(grandeZone);
        add(panneauTaille, BorderLayout.NORTH);
        add(texteAsc, BorderLayout.CENTER);

    }
}
