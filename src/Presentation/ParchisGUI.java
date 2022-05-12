package Presentation;

import Domain.Parchis;

import javax.swing.*;

public class ParchisGUI extends JFrame {
    private Parchis parchis;
    private GameSection gameSection;

    public ParchisGUI(){
        initElements();
        prepareElements();
    }

    private void initElements(){
        parchis = new Parchis();
        gameSection = new GameSection(parchis);
    }

    private void prepareElements(){
        prepareFrame();
        prepareComponents();
    }

    private void prepareFrame(){
        this.setTitle("PoobChis");
        this.setSize(1100, 730);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void prepareComponents(){
        this.getContentPane().add(gameSection);
    }

    public static void main(String[] args) {
        new ParchisGUI();
    }
}