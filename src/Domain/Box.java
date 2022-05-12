package Domain;

import java.awt.*;

public class Box {
    protected int width, height, xCoordinate, yCoordinate;
    protected int[] xCoordinates, yCoordinates;
    protected Color color;

    public Box(int width, int height, int xCoordinate, int yCoordinate, Color color){
        this.width = width;
        this.height = height;
        this.xCoordinate = xCoordinate  == -1 ? 0 : xCoordinate;
        this.yCoordinate = yCoordinate == -1 ? 0 : yCoordinate;
        this.color = color == null ? Color.black : color;
    }

    public Box(int[] xCoordinates, int[] yCoordinates, int height, int width, Color color){
        this(height, width, -1, -1, color);
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
    }

    public Color getColor(){
        return this.color;
    }

    public int getXCoordinate(){
        return this.xCoordinate;
    }

    public int getYCoordinate(){
        return this.yCoordinate;
    }

    public int[] getXCoordinates(){
        return xCoordinates;
    }

    public int[] getYCoordinates(){
        return yCoordinates;
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }
}
