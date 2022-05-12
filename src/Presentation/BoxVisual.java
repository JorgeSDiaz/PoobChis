package Presentation;

import Domain.Box;

import javax.swing.*;
import java.awt.*;

public class BoxVisual extends JPanel {
    private Box[] boxes;

    public BoxVisual(Box box){
        this.boxes = boxes;
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D graphics2D = (Graphics2D) g;
        for (Box b: boxes){
            if (b.getColor().equals(Color.black)){
                graphics2D.drawRect(b.getXCoordinate(), b.getYCoordinate(), b.getWidth(), b.getHeight());
            } else {
                graphics2D.setColor(b.getColor());
                graphics2D.fillRect(b.getXCoordinate(), b.getYCoordinate(), b.getWidth(), b.getHeight());
            }
        }
    }
}
