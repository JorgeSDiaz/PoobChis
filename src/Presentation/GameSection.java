package Presentation;

import Domain.Parchis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class GameSection extends JPanel {
    private Parchis parchis;
    private GamePanel gamePanel;
    private PlayerPanel playerPanel;
    private JButton rolldice;

    /**
     * constructor of the panel containing the player's menu and where the board is displayed
     */
    public GameSection(){
        this.parchis = new Parchis(new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList("normal", "rocket", "normal", "normal")),
                new ArrayList<>(Arrays.asList("normal", "rocket", "normal", "normal")))));
        preparePanel();
        initComponents();
        prepareComponents();
        prepareActions();
    }

    /**
     * prepare the panel
     */
    private void preparePanel(){
        setLayout(new BorderLayout());
    }

    /**
     * initializes the panel elements
     */
    private void initComponents(){
        rolldice = new JButton("Roll Dice");
        gamePanel = new GamePanel(parchis);
        playerPanel = new PlayerPanel(parchis.getDices()[0].getValue(), parchis.getDices()[1].getValue());
    }

    /**
     * prepares actions on the panel
     */
    private void prepareActions(){
        rolldice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionRoll();
            }
        });
    }

    /**
     * action of throwing the dice
     */
    private void actionRoll(){
        parchis.getDices()[0].roll();
        parchis.getDices()[1].roll();
        playerPanel.actionRoll(parchis.getDices()[0].getValue(), parchis.getDices()[1].getValue());
        parchis.play();
        gamePanel.setBoxes(parchis.getBoard().getBoxes());
        gamePanel.repaint();
    }

    /**
     * prepare the panel
     */
    private void prepareComponents(){
        this.setBackground(Color.RED);
        this.add(rolldice, BorderLayout.SOUTH);
        this.add(playerPanel, BorderLayout.EAST);
        this.add(gamePanel, BorderLayout.WEST);
    }
}
