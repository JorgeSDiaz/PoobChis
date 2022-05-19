package Presentation;

import Domain.*;
import Domain.Box;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    Box[] boxes;

    /**
     * game panel builder
     * @param parchis Parchis on which we work
     */
    public GamePanel(Parchis parchis){
        this.boxes = parchis.getBoard().getBoxes();
    }

    /**
     * draws the panel
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setSize(700, 730);
        setBackground(new Color(239, 239, 239));
        paintBoard(g);
        paintTokens(g);
    }

    /**
     * define the boxes to be drawn
     * @param newBoxes the boxes to be drawn
     */
    public void setBoxes(Box[] newBoxes){
        this.boxes = newBoxes;
    }

    /**
     * method of drawing the board
     * @param g the <code>Graphics</code> object to protect
     */
    private void  paintBoard(Graphics g){
        Graphics2D graphics2D = (Graphics2D) g;
        for (Box b: boxes){
            if (b.getXCoordinate() != 0 && b.getYCoordinate() != 0){
                if (b.getColor().equals(Color.black)){
                    graphics2D.drawRect(b.getXCoordinate(), b.getYCoordinate(), b.getWidth(), b.getHeight());
                } else {
                    graphics2D.setColor(b.getColor());
                    graphics2D.fillRect(b.getXCoordinate(), b.getYCoordinate(), b.getWidth(), b.getHeight());
                    graphics2D.setColor(Color.black);
                }
            } else {
                graphics2D.setColor(b.getColor());
                graphics2D.drawPolygon(b.getXCoordinates(), b.getYCoordinates(), b.getXCoordinates().length);
                graphics2D.setColor(Color.black);
            }
        }
    }

    /**
     * method of drawing the cards of each home
     * @param g the <code>Graphics</code> object to protect
     */
    private void paintTokens(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        for (int i = 0; i < 4; i++){
            Home home = (Home) boxes[i];
            for (int j = 0; j < 4; j++){
                Token token = home.getTokens()[j];
                g2d.setColor(token.getSecondColor());
                g2d.fillOval(token.getXCoordinate(), token.getYCoordinate(), 25, 25);
                g2d.setColor(home.getColor());
                g2d.fillRect(token.getXCoordinate() + 5, token.getYCoordinate() + 5, 15, 15);
            }
        }
    }
}
