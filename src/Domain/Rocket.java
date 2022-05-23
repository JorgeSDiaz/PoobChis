package Domain;

import java.awt.*;

public class Rocket extends Token{

    public Rocket(int xCoordinate, int yCoordinate){
        super(xCoordinate, yCoordinate);
        this.SECOND_COLOR = new Color(255, 153, 102);
    }

    public Rocket(){
        this(0, 0);
    }
}
