package Presentation;

import Domain.Dice;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class DiceVisual extends JPanel {
    private Color BACKGROUND_COLOR = Color.white;
    private Color ORNAMENTS_COLOR = Color.black;
    private int xCor;
    private int yCor;
    private Dice dice;

    public DiceVisual(int xCor, int yCor){
        this.xCor = xCor;
        this.yCor = yCor;
        dice = new Dice();
    }

    public void roll(){
        dice.roll();
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setColor(BACKGROUND_COLOR);
        graphics2D.fillRect(xCor, yCor, 125, 126);
        drawPoints(graphics2D, dice.getValue());

        setSize(125, 126);
        setLocation(xCor + 2, yCor + 1);
    }

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
