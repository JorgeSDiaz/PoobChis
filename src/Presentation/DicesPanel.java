package Presentation;

import Domain.Dice;

import javax.swing.*;
import java.awt.*;

public class DicesPanel extends JPanel {
    private byte diceValueOne, diceValueTwo;
    private DiceVisual[] diceVisual;

    /**
     * Constructor of the panel on which the dice are displayed
     * @param valueOne dice value one
     * @param valueTwo dice value two
     */
    public DicesPanel(byte valueOne, byte valueTwo){
        this.diceValueOne = valueOne;
        this.diceValueTwo = valueTwo;
        initElements();
        prepareElements();
    }

    /**
     * initializes the panel elements
     */
    private void initElements(){
        diceVisual = new DiceVisual[]{new DiceVisual(1, 1, diceValueOne),
                new DiceVisual(130, 1, diceValueTwo)};
    }

    /**
     * prepares the panel elements
     */
    private void prepareElements(){
        this.add(diceVisual[0]);
        this.add(diceVisual[1]);
    }

    /**
     * action that allows to change the values of the dice visually
     * @param newValueOne new value of dice one
     * @param newValueTwo new value of dice two
     */
    public void actionRoll(byte newValueOne, byte newValueTwo){
        diceVisual[0].roll(newValueOne);
        diceVisual[1].roll(newValueTwo);
        this.refresh();
    }

    /**
     * updates the elements within the panel
     */
    private void refresh(){
        diceVisual[0].repaint();
        diceVisual[1].repaint();
    }

    /**
     * draws the panel together with its elements
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.black);
        setSize(260, 130);
        setLocation(70, 20);
    }
}
