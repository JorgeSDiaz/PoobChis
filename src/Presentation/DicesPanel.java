package Presentation;

import Domain.Dice;

import javax.swing.*;
import java.awt.*;

public class DicesPanel extends JPanel {
    private byte diceValueOne, diceValueTwo;
    private DiceVisual[] diceVisual;

    public DicesPanel(byte valueOne, byte valueTwo){
        this.diceValueOne = valueOne;
        this.diceValueTwo = valueTwo;
        initElements();
        prepareElements();
    }

    private void initElements(){
        diceVisual = new DiceVisual[]{new DiceVisual(1, 1, diceValueOne),
                new DiceVisual(130, 1, diceValueTwo)};
    }

    private void prepareElements(){
        this.add(diceVisual[0]);
        this.add(diceVisual[1]);
    }

    public void actionRoll(byte newValueOne, byte newValueTwo){
        diceVisual[0].roll(newValueOne);
        diceVisual[1].roll(newValueTwo);
        this.refresh();
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
        setLocation(70, 20);
    }
}
