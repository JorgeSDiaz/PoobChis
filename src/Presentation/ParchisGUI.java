package Presentation;

import Domain.Parchis;

import javax.swing.*;

public class ParchisGUI extends JFrame {
    private GameSection gameSection;

    /**
     * parchis window builder
     */
    public ParchisGUI(){
        initElements();
        prepareElements();
    }

    /**
     * initializes the window elements
     */
    private void initElements(){
        gameSection = new GameSection();
    }

    /**
     * prepare the window elements
     */
    private void prepareElements(){
        prepareFrame();
        prepareComponents();
    }

    /**
     * prepare the window
     */
    private void prepareFrame(){
        this.setTitle("PoobChis");
        this.setSize(1100, 760);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * prepare the window components
     */
    private void prepareComponents(){
        this.getContentPane().add(gameSection);
    }

    public static void main(String[] args) {
        StartMenu startMenu = new StartMenu();
        startMenu.setVisible(true);
    }
}