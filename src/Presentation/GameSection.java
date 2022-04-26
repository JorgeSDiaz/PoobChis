package Presentation;

import javax.swing.*;
import java.awt.*;

public class GameSection extends JPanel {
    GamePanel gamePanel;
    PlayerPanel playerPanel;

    public GameSection(){
        gamePanel = new GamePanel();
        playerPanel = new PlayerPanel();
        preparePanel();
        prepareComponents();
    }

    private void preparePanel(){
        setLayout(new BorderLayout());
    }

    private void prepareComponents(){
        this.add(playerPanel, BorderLayout.EAST);
        this.add(gamePanel, BorderLayout.WEST);
    }
}
