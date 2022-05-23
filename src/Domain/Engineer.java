package Domain;

import java.awt.*;

public class Engineer extends Token{

    public Engineer(int xCoordinate, int yCoordinate){
        super(xCoordinate, yCoordinate);
        this.SECOND_COLOR = new Color(224, 160, 210);
    }

    public Engineer(){
        this(0, 0);
    }
}
