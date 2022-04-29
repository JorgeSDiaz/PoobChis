package Presentation;

import Domain.Dice;

import javax.swing.*;
import java.awt.*;

public class DicesPanel extends JPanel {
    private DiceVisual[] diceVisual;

    public DicesPanel(){
        initElements();
        prepareElements();
    }

    private void initElements(){
        diceVisual = new DiceVisual[]{new DiceVisual(1, 1), new DiceVisual(130, 1)};
    }

    private void prepareElements(){
        this.add(diceVisual[0]);
        this.add(diceVisual[1]);
    }

    public void actionRoll(){
        diceVisual[0].roll();
        diceVisual[1].roll();
        refresh();
    }

    private void refresh(){
        diceVisual[0].repaint();
        diceVisual[1].repaint();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.black);
        setSize(260, 130);
        setLocation(105, 20);
    }
}
