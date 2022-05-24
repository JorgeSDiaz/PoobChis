package Domain;

import java.awt.*;

public class Token {
    protected int xCoordinate, yCoordinate;
    protected int box;
    protected Color SECOND_COLOR = new Color(153, 102, 255);

    /**
     * Token builder
     * @param xCoordinate x-coordinate where the token is located
     * @param yCoordinate y-coordinate where the token is located
     */
    public Token(int xCoordinate, int yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Token(){
        this(0, 0);
    }

    /**
     * returns the second color (the one that characterizes the type of token)
     * @return Second color
     */
    public Color getSecondColor(){
        return SECOND_COLOR;
    }

    /**
     * we obtain the x-coordinate of the token
     * @return X-coordinate
     */
    public int getXCoordinate(){
        return xCoordinate;
    }

    /**
     * we obtain the y-coordinate of the token
     * @return Y-coordinate
     */
    public int getYCoordinate(){
        return yCoordinate;
    }

    /**
     * the box in which it is located is obtained
     * @return the box in which it is located
     */
    public int getBox(){
        return box;
    }

    public void setPosition(int xCoordinate, int yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public void moveTo(int xCoordinate, int yCoordinate, int newBox){
        this.setPosition(xCoordinate, yCoordinate);
        this.box = newBox;
    }
}
