package Presentation;

import Domain.*;
import Domain.Box;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    Box[] boxes;

    public GamePanel(Parchis parchis){
        this.boxes = parchis.getBoard().getBoxes();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setSize(700, 730);
        setBackground(new Color(239, 239, 239));
        paintBoard(g);
        paintTokens(g);
    }

    public void refresh(Parchis parchis){
        this.boxes = parchis.getBoard().getBoxes();
        this.repaint();
    }

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

    private void paintTokens(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        for (int i = 0; i < 4; i++){
            Home home = (Home) boxes[i];
            for (int j = 0; j < 4; j++){
                g2d.setColor(home.getTokens()[j].getSecondColor());
                g2d.fillOval(home.getCoordinatesTokens()[j][0], home.getCoordinatesTokens()[j][1], 25, 25);
                g2d.setColor(home.getColor());
                g2d.fillRect(home.getCoordinatesTokens()[j][0] + 5, home.getCoordinatesTokens()[j][1] + 5, 15, 15);
            }
        }
    }
}
