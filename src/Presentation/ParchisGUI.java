package Presentation;

import Domain.Parchis;

import javax.swing.*;

public class ParchisGUI extends JFrame {
    private GameSection gameSection;

    public ParchisGUI(){
        initElements();
        prepareElements();
    }

    private void initElements(){
        gameSection = new GameSection();
    }

    private void prepareElements(){
        prepareFrame();
        prepareComponents();
    }

    private void prepareFrame(){
        this.setTitle("PoobChis");
        this.setSize(1100, 760);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void prepareComponents(){
        this.getContentPane().add(gameSection);
    }

    public static void main(String[] args) {
        //StartMenu startMenu = new StartMenu();
        //startMenu.setVisible(true);
        ParchisGUI parchisGUI = new ParchisGUI();
        parchisGUI.setVisible(true);
    }
}