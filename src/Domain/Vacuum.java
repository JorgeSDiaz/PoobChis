package Domain;

import java.awt.*;

public class Vacuum extends Token{

    public Vacuum(int xCoordinate, int yCoordinate){
        super(xCoordinate, yCoordinate);
        this.SECOND_COLOR = new Color(150, 150, 150);
    }

    public Vacuum(){
        this(0, 0);
    }
}
