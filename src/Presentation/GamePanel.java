package Presentation;

import Domain.Board;
import Domain.Box;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    Box[] boxes;

    public GamePanel(Board board){
        this.boxes = board.getBoxes();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setSize(700, 730);
        setBackground(Color.white);
        paintBoard(g);
    }

    private void  paintBoard(Graphics g){
        Graphics2D graphics2D = (Graphics2D) g;
        for (Box b: boxes){
            if (b != null){
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
    }
}
