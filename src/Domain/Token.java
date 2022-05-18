package Domain;

import java.awt.*;

public class Token {
    private int xCoordinate, yCoordinate;
    private static final Color SECOND_COLOR = new Color(153, 102, 255);

    public Color getSecondColor(){
        return SECOND_COLOR;
    }

    public void setXCoordinate(int newXCoordinate){
        xCoordinate = newXCoordinate;
    }

    public void setYCoordinate(int newYCoordinate){
        yCoordinate = newYCoordinate;
    }
}
