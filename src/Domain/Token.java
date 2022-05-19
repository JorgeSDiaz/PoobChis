package Domain;

import java.awt.*;

public class Token {
    private int xCoordinate, yCoordinate;
    int box;
    private static final Color SECOND_COLOR = new Color(153, 102, 255);

    /**
     * Token builder
     * @param xCoordinate x-coordinate where the token is located
     * @param yCoordinate y-coordinate where the token is located
     */
    public Token(int xCoordinate, int yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    /**
     * returns the second color (the one that characterizes the type of token)
     * @return Second color
     */
    public Color getSecondColor(){
        return SECOND_COLOR;
    }

    /**
     * modifies the x-coordinate of the token
     * @param newXCoordinate new x-coordinate
     */
    public void setXCoordinate(int newXCoordinate){
        xCoordinate = newXCoordinate;
    }

    /**
     * we obtain the x-coordinate of the token
     * @return X-coordinate
     */
    public int getXCoordinate(){
        return xCoordinate;
    }

    /**
     * modifies the y-coordinate of the token
     * @param newYCoordinate new y-coordinate
     */
    public void setYCoordinate(int newYCoordinate){
        yCoordinate = newYCoordinate;
    }

    /**
     * we obtain the y-coordinate of the token
     * @return Y-coordinate
     */
    public int getYCoordinate(){
        return yCoordinate;
    }

    /**
     * the box in which it is located is defined
     * @param newBox the box in which it is located
     */
    public void setBox(int newBox){
        this.box = newBox;
    }

    /**
     * the box in which it is located is obtained
     * @return the box in which it is located
     */
    public int getBox(){
        return box;
    }
}
