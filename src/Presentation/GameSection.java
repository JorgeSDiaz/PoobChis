package Presentation;

import Domain.Parchis;

import javax.swing.*;
import java.awt.*;

public class GameSection extends JPanel {
    private Parchis parchis;
    private GamePanel gamePanel;
    private PlayerPanel playerPanel;

    public GameSection(Parchis parchis){
        this.parchis = parchis;
        preparePanel();
        initComponents();
        prepareComponents();
    }

    private void preparePanel(){
        setLayout(new BorderLayout());
    }

    private void initComponents(){
        gamePanel = new GamePanel();
        playerPanel = new PlayerPanel(parchis.getDices());
    }

    private void prepareComponents(){
        this.setBackground(Color.RED);
        this.add(playerPanel, BorderLayout.EAST);
        this.add(gamePanel, BorderLayout.WEST);
    }
}
