package Presentation;

import javax.swing.*;
import java.awt.*;

public class ParchisGUI extends JFrame {
    JPanel panel;
    GamePanel gamePanel;

    public ParchisGUI(){
        initElements();
        prepareElements();
    }

    private void initElements(){
        panel = new JPanel();
        gamePanel = new GamePanel();
    }

    private void prepareElements(){
        prepareFrame();
        prepareComponents();
    }

    //a
    private void prepareFrame(){
        this.setTitle("PoobChis");
        this.setSize(1200, 700);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void prepareComponents(){
        preparePanel();
        panel.add(gamePanel, BorderLayout.WEST);
    }

    private void preparePanel(){
        panel.setBackground(Color.gray);
        panel.setLayout(new BorderLayout());
        this.getContentPane().add(panel);
    }

    public static void main(String[] args) {
        new ParchisGUI();
    }
}