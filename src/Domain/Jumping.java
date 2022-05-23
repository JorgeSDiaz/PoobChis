package Domain;

import java.awt.*;

public class Jumping extends Token{

    public Jumping(int xCoordinate, int yCoordinate){
        super(xCoordinate, yCoordinate);
        this.SECOND_COLOR = new Color(37, 255, 167);
    }

    public Jumping(){
        this(0, 0);
    }
}
