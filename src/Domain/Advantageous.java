package Domain;

import java.awt.*;

public class Advantageous extends Token{

    public Advantageous(int xCoordinate, int yCoordinate){
        super(xCoordinate, yCoordinate);
        this.SECOND_COLOR = new Color(113, 184, 255);
    }

    public Advantageous(){
        this(0, 0);
    }
}
