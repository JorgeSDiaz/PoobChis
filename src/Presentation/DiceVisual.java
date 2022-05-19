package Presentation;

import javax.swing.*;
import java.awt.*;

public class DiceVisual extends JPanel {
    private Color BACKGROUND_COLOR = Color.white;
    private Color ORNAMENTS_COLOR = Color.black;
    private int xCor, yCor;
    private byte value;

    /**
     * dice visualization constructor
     * @param xCor x-coordinate where to place the die
     * @param yCor y-coordinate where to place the die
     * @param value value to be represented by the dice
     */
    public DiceVisual(int xCor, int yCor, int value){
        this.xCor = xCor;
        this.yCor = yCor;
        this.value = (byte) value;
    }

    /**
     * draws the dice
     * @param g  the <code>Graphics</code> context in which to paint
     */
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setColor(BACKGROUND_COLOR);
        graphics2D.fillRect(xCor, yCor, 125, 126);
        drawPoints(graphics2D, this.value);

        setSize(125, 126);
        setLocation(xCor + 2, yCor + 1);
    }

    /**
     * changes the value to be represented by the dice
     * @param newValue to be represented
     */
    public void roll(byte newValue){
        this.value = newValue;
    }

    /**
     * draws the points of the die value
     * @param g2d the <code>Graphics</code> context in which to paint
     * @param value value of the dice
     */
    private void drawPoints(Graphics2D g2d, byte value){
        g2d.setColor(ORNAMENTS_COLOR);
        if (value == 1){
            g2d.fillOval(50, 50, 20, 20);
        } else if (value == 2){
            g2d.fillOval(20, 20, 20, 20);
            g2d.fillOval(80, 80, 20, 20);
        } else if (value == 3){
            drawPoints(g2d, (byte) 2);
            drawPoints(g2d, (byte) 1);
        } else if (value == 4){
            drawPoints(g2d, (byte) 2);
            g2d.fillOval(80, 20, 20, 20);
            g2d.fillOval(20, 80, 20, 20);
        } else if (value == 5){
            drawPoints(g2d, (byte) 4);
            drawPoints(g2d, (byte) 1);
        } else if (value == 6){
            drawPoints(g2d, (byte) 4);
            g2d.fillOval(20, 50, 20, 20);
            g2d.fillOval(80, 50, 20, 20);
        }


    }
}
