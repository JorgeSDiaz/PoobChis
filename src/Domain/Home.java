package Domain;

import java.awt.*;

public class Home extends Box{
    int startBox;
    Token[] tokens;
    int[][] coordinatesTokens;

    /**
     * home box builder
     * @param width width of the home box
     * @param height height of the home box
     * @param xCoordinate x-coordinate of the home box
     * @param yCoordinate y-coordinate of the home box
     * @param startBox outbox that corresponds to the home box
     * @param color Home box color
     */
    public Home(int width, int height, int xCoordinate, int yCoordinate, int startBox, Color color){
        super(width, height, xCoordinate, yCoordinate, color);
        this.cantToken = 4;
        this.startBox = startBox;
        this.coordinatesTokens = new int[][]{{xCoordinate + 45, yCoordinate + 45},
                {xCoordinate + 45, yCoordinate + 145}, {xCoordinate + 145, yCoordinate + 45},
                {xCoordinate + 145, yCoordinate + 145}};
        this.tokens = new Token[]{new Token(xCoordinate + 45,yCoordinate + 45),
                new Token(xCoordinate + 45, yCoordinate + 145),
                new Token(xCoordinate + 145, yCoordinate + 45),
                new Token(xCoordinate + 145, yCoordinate + 145)};
    }

    /**
     * define the set of tokens for this home
     * @param newTokens set of tokens
     */
    public void setTokens(Token[] newTokens){
        this.tokens = tokens;
    }

    /**
     * returns the tokens inside the home box
     * @return list of tokens
     */
    public Token[] getTokens(){
        return tokens;
    }

    /**
     * returns the number of the output box
     * @return startBox
     */
    public int getStartBox(){
        return startBox;
    }
}
