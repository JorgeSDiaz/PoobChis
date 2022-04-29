package Presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartMenu extends JFrame {
    private ImageIcon icon;
    private JLabel signboard;
    private JPanel containerButtons;
    private JButton twoPlayers;
    private JButton onePlayer;
    private JPanel container;
    private ParchisGUI interfaz;


    /**
     * Builder of the start menu that prepares the elements and the actions
     */
    public StartMenu(){
        prepareElements();
        prepareActions();
    }

    /**
     * Prepare the different elements of the initial menu
     */
    private void prepareElements(){
        setTitle("POOBchis");
        setSize(642, 640);
        setResizable(false);
        setLocationRelativeTo(null);
        prepareSignboard();
        prepareButtons();
    }

    /**
     * Prepare the header with the name of the game
     */
    private void prepareSignboard() {
        container = new JPanel();
        container.setLayout(new BorderLayout());
        container.setBackground(Color.PINK);
        add(container);
        signboard = new JLabel();
        signboard.setIcon(new ImageIcon("images/signboard.jpg"));
        container.add(signboard, BorderLayout.CENTER);
    }

    /**
     * Prepare the buttons for the number of players
     */
    private void prepareButtons(){
        containerButtons = new JPanel();
        containerButtons.setBackground(new Color(243, 236, 145));
        twoPlayers = new JButton("Player vs Player");
        twoPlayers.setBackground(new Color(59,211,81));
        onePlayer = new JButton("Player vs Machine");
        onePlayer.setBackground(new Color(51,163,210));
        containerButtons.add(twoPlayers);
        containerButtons.add(onePlayer);
        container.add(containerButtons, BorderLayout.SOUTH);
    }

    /**
     * Prepare menu actions
     */
    private void prepareActions(){
        onePlayer.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interfaz = new ParchisGUI();
                interfaz.setVisible(false);
                String name1 = JOptionPane.showInputDialog(null, "Enter your name: ");
                String[] buttons = {"Beginner", "Expert" };
                int optionReturns = JOptionPane.showOptionDialog(null, "Difficulty level",
                        "Choose an option", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, icon, buttons, "default");
                interfaz.setVisible(true);
                setVisible(false);
            }
        }));

        twoPlayers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interfaz = new ParchisGUI();
                interfaz.setVisible(false);
                //first player
                String name1 = JOptionPane.showInputDialog(null, "Enter the name of player 1: ");
                //second player
                String name2 = JOptionPane.showInputDialog(null, "Enter the name of player 2: ");
                interfaz.setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        StartMenu startMenu = new StartMenu();
        startMenu.setVisible(true);
    }

}
