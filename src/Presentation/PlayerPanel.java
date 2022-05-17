package Presentation;

import javax.swing.*;
import java.awt.*;

public class PlayerPanel extends JPanel {
    private byte diceValueOne, diceValueTwo;
    private DicesPanel dicesPanel;

    public PlayerPanel(byte valueOne, byte valueTwo){
        this.diceValueOne = valueOne;
        this.diceValueTwo = valueTwo;
        initComponents();
        prepareComponents();
    }

    private void initComponents(){
        dicesPanel = new DicesPanel(diceValueOne, diceValueTwo);
    }

    private void prepareComponents(){
        preparePanel();
        this.add(dicesPanel, BorderLayout.NORTH);
    }

    private void preparePanel(){
        setLayout(new BorderLayout());
    }

    public void actionRoll(byte newValueOne, byte newValueTwo){
        dicesPanel.actionRoll(newValueOne, newValueTwo);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setSize(470, 700);
        setLocation(700, 0);
        setBackground(Color.DARK_GRAY);
    }
}
