package Domain;

import java.awt.*;

public class Box {
    protected int cantToken, width, height, xCoordinate, yCoordinate;
    protected int[] xCoordinates, yCoordinates;
    protected Color color;

    /**
     * builder for rectangular/square boxes
     * @param width width of the box
     * @param height height of the box
     * @param xCoordinate X coordinate where the box will be located
     * @param yCoordinate Y coordinate where the box will be located
     * @param color Box color
     */
    public Box(int width, int height, int xCoordinate, int yCoordinate, Color color){
        this.cantToken = 0;
        this.width = width;
        this.height = height;
        this.xCoordinate = xCoordinate  == -1 ? 0 : xCoordinate;
        this.yCoordinate = yCoordinate == -1 ? 0 : yCoordinate;
        this.color = color == null ? Color.black : color;
    }

    /**
     * constructor for a polygonal box
     * @param xCoordinates X coordinates of the points of the box figure
     * @param yCoordinates Y coordinates of the points of the box figure
     * @param height height of the box
     * @param width width of the box
     * @param color Box color
     */
    public Box(int[] xCoordinates, int[] yCoordinates, int height, int width, Color color){
        this(height, width, -1, -1, color);
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
    }

    /**
     * returns the color of the box
     * @return Color
     */
    public Color getColor(){
        return this.color;
    }

    /**
     * returns the X-coordinate of the box
     * @return int xCoordinate
     */
    public int getXCoordinate(){
        return this.xCoordinate;
    }

    /**
     * returns the y-coordinate of the box
     * @return int yCoordinate
     */
    public int getYCoordinate(){
        return this.yCoordinate;
    }

    /**
     * returns the x-coordinate array of irregularly shaped boxes
     * @return int[] xCoordinates
     */
    public int[] getXCoordinates(){
        return xCoordinates;
    }

    /**
     * returns the y-coordinate array of irregularly shaped boxes
     * @return int[] yCoordinates
     */
    public int[] getYCoordinates(){
        return yCoordinates;
    }

    /**
     * returns the box width
     * @return int width
     */
    public int getWidth(){
        return this.width;
    }

    /**
     * returns the box height
     * @return int height
     */
    public int getHeight(){
        return this.height;
    }

    /**
     * Increases the number of cards registered in the box.
     * @param cant how much it increases
     */
    public void plusCantToken(int cant){
        cantToken += cant;
    }

    /**
     * the number of tokens registered in the box is decreasing
     * @param cant how much it decreases
     */
    public void minusCantToken(int cant){
        cantToken -= cant;
    }

    /**
     * returns the number of tokens in the box
     * @return number of tokens
     */
    public int getCantToken(){
        return cantToken;
    }

    public void setColor(Color newColor){
        this.color = newColor;
    }
}
