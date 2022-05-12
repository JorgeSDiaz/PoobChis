package Domain;

import java.awt.*;

public class Home extends Box{
    int token, startBox;

    public Home(int width, int height, int xCoordinate, int yCoordinate, int startBox, Color color){
        super(width, height, xCoordinate, yCoordinate, color);
        token = 0;
        this.startBox = startBox;
    }
}
