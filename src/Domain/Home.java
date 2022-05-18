package Domain;

import java.awt.*;

public class Home extends Box{
    int startBox;
    Token[] tokens;
    int[][] coordinatesTokens;

    public Home(int width, int height, int xCoordinate, int yCoordinate, int startBox, Color color){
        super(width, height, xCoordinate, yCoordinate, color);
        this.cantToken = 4;
        this.startBox = startBox;
        this.tokens = new Token[]{new Token(), new Token(), new Token(), new Token()};
        this.coordinatesTokens = new int[][]{{xCoordinate + 45, yCoordinate + 45},
                {xCoordinate + 45, yCoordinate + 145}, {xCoordinate + 145, yCoordinate + 45},
                {xCoordinate + 145, yCoordinate + 145}};
    }

    public void setTokens(Token[] newTokens){
        this.tokens = tokens;
    }

    public Token[] getTokens(){
        return tokens;
    }

    public int[][] getCoordinatesTokens(){
        return coordinatesTokens;
    }

    public int getStartBox(){
        return startBox;
    }
}
