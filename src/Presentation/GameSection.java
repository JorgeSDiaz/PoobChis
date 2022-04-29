package Presentation;

import javax.swing.*;
import java.awt.*;

public class GameSection extends JPanel {
    GamePanel gamePanel;
    PlayerPanel playerPanel;

    public GameSection(){
        preparePanel();
        initComponents();
        prepareComponents();
    }

    private void preparePanel(){
        setLayout(new BorderLayout());
    }

    private void initComponents(){
        gamePanel = new GamePanel();
        playerPanel = new PlayerPanel();
    }

    private void prepareComponents(){
        this.setBackground(Color.RED);
        this.add(playerPanel, BorderLayout.EAST);
        this.add(gamePanel, BorderLayout.WEST);
    }
}
