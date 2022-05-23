package Presentation;

import javax.swing.*;
import java.util.ArrayList;

public class ParchisGUI extends JFrame {
    private GameSection gameSection;
    static StartMenu startMenu;
    private String PlayerOne, PlayerTwo;
    private ArrayList tokensPlayerOne, tokensPlayerTwo;

    /**
     * parchis window builder
     */
    public ParchisGUI(String playerOne, ArrayList<String> TokensPlayerOne, String playerTwo, ArrayList<String> TokensPlayerTwo){
        PlayerOne = playerOne;
        PlayerTwo = playerTwo;
        tokensPlayerOne = TokensPlayerOne;
        tokensPlayerTwo = TokensPlayerTwo;
        initElements();
        prepareElements();
    }

    /**
     * initializes the window elements
     */
    private void initElements(){

        gameSection = new GameSection(tokensPlayerOne, tokensPlayerTwo);
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
        startMenu = new StartMenu();
        startMenu.setVisible(true);
    }
}