package Presentation;

import Domain.Dice;

import javax.swing.*;
import java.awt.*;

public class DicesPanel extends JPanel {
    private Dice[] dices;
    private DiceVisual[] diceVisual;

    public DicesPanel(Dice[] dices){
        this.dices = dices;
        initElements();
        prepareElements();
    }

    private void initElements(){
        diceVisual = new DiceVisual[]{new DiceVisual(1, 1, dices[0].getValue()),
                new DiceVisual(130, 1, dices[1].getValue())};
    }

    private void prepareElements(){
        this.add(diceVisual[0]);
        this.add(diceVisual[1]);
    }

    public void actionRoll(){
        dices[0].roll();
        dices[1].roll();
        diceVisual[0].roll(dices[0].getValue());
        diceVisual[1].roll(dices[1].getValue());
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
        setLocation(70, 20);
    }
}
