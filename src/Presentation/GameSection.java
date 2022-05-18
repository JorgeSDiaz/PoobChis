package Presentation;

import Domain.Parchis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameSection extends JPanel {
    private Parchis parchis;
    private GamePanel gamePanel;
    private PlayerPanel playerPanel;
    private JButton rolldice;

    public GameSection(){
        this.parchis = new Parchis();
        preparePanel();
        initComponents();
        prepareComponents();
        prepareActions();
    }

    private void preparePanel(){
        setLayout(new BorderLayout());
    }

    private void initComponents(){
        rolldice = new JButton("Roll Dice");
        gamePanel = new GamePanel(parchis);
        playerPanel = new PlayerPanel(parchis.getDices()[0].getValue(), parchis.getDices()[1].getValue());
    }

    private void prepareActions(){
        rolldice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parchis.getDices()[0].roll();
                parchis.getDices()[1].roll();
                playerPanel.actionRoll(parchis.getDices()[0].getValue(), parchis.getDices()[1].getValue());
                parchis.play();
                gamePanel = new GamePanel(parchis);
                gamePanel.repaint();
            }
        });
    }

    private void prepareComponents(){
        this.setBackground(Color.RED);
        this.add(rolldice, BorderLayout.SOUTH);
        this.add(playerPanel, BorderLayout.EAST);
        this.add(gamePanel, BorderLayout.WEST);
    }
}
