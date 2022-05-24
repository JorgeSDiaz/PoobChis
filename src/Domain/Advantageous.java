package Domain;

import java.awt.*;

public class Advantageous extends Token{

    private int turns;

    public Advantageous(int xCoordinate, int yCoordinate){
        super(xCoordinate, yCoordinate);
        this.SECOND_COLOR = new Color(113, 184, 255);
        this.turns = 0;
    }

    public int getTurns(){
        return this.turns;
    }

    public void resetTurns(){
        this.turns = 0;
    }

    public Advantageous(){
        this(0, 0);
    }

    public void moveTo(int xCoordinate, int yCoordinate, int newBox){
        this.setPosition(xCoordinate, yCoordinate);
        this.box = newBox;
        this.turns += 1;
    }
}
