package Presentation;

import javax.swing.*;
import java.awt.*;

public class PlayerPanel extends JPanel {
    private byte diceValueOne, diceValueTwo;
    private int currentPlayer;
    private DicesPanel dicesPanel;
    private JLabel player;

    public PlayerPanel(byte valueOne, byte valueTwo, int currentPlayer){
        this.diceValueOne = valueOne;
        this.diceValueTwo = valueTwo;
        this.currentPlayer = currentPlayer;
        initComponents();
        prepareComponents();
    }

    private void initComponents(){
        dicesPanel = new DicesPanel(diceValueOne, diceValueTwo);
        player = new JLabel();
    }

    private void prepareComponents(){
        preparePanel();
        preparePlayer();
        this.add(dicesPanel, BorderLayout.NORTH);
    }

    private void preparePlayer(){
        player.setText("Player: " + (currentPlayer == 0 ? "Red" : "Yellow"));
        player.setBounds(10, 20, 500, 500);
        this.add(player, BorderLayout.CENTER);
    }

    private void preparePanel(){
        setLayout(new BorderLayout());
    }

    public void actionRoll(byte newValueOne, byte newValueTwo){
        dicesPanel.actionRoll(newValueOne, newValueTwo);
    }

    public void setPlayer(int newPlayer){
        this.currentPlayer = newPlayer;
        player.setText("Player: " + (currentPlayer == 0 ? "Red" : "Yellow"));
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setSize(470, 700);
        setLocation(700, 0);
        setBackground(Color.gray);
    }
}
