package Presentation;

import javax.swing.*;

public class ParchisGUI extends JFrame {
    GameSection gameSection;

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
        this.setSize(1200, 700);
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