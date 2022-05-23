package Domain;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Home extends Box{
    int startBox;
    ArrayList<Token> tokens;

    /**
     * home box builder
     * @param width width of the home box
     * @param height height of the home box
     * @param xCoordinate x-coordinate of the home box
     * @param yCoordinate y-coordinate of the home box
     * @param startBox outbox that corresponds to the home box
     * @param color Home box color
     */
    public Home(int width, int height, int xCoordinate, int yCoordinate, int startBox, Color color, ArrayList<String> tokens){
        super(width, height, xCoordinate, yCoordinate, color);
        this.cantToken = 4;
        this.startBox = startBox;
        this.tokens = new ArrayList<Token>(4);
        setTokens(tokens.isEmpty() ? new ArrayList<>(Arrays.asList("normal", "normal", "normal", "normal")) : tokens);
    }

    /**
     * define the set of tokens for this home
     * @param tokens
     */
    public void setTokens(ArrayList<String> tokens) {
        for (String s : tokens) {
            if (s.equals("normal")) {
                this.tokens.add(new Token());
            } else if (s.equals("rocket")) {
                this.tokens.add(new Rocket());
            } else if (s.equals("vacuum")) {
                this.tokens.add(new Vacuum());
            } else if (s.equals("jumping")) {
                this.tokens.add(new Jumping());
            } else if (s.equals("advantageous")) {
                this.tokens.add(new Advantageous());
            } else if (s.equals("engineer")) {
                this.tokens.add(new Engineer());
            }
            this.addToken();
        }
    }

    private void addToken(){
        for (int i = 0; i < tokens.size(); i++){
            if (i == 0){
                this.tokens.get(i).setPosition(xCoordinate + 45, yCoordinate + 45);
            } else if (i == 1) {
                this.tokens.get(i).setPosition(xCoordinate + 45, yCoordinate + 145);
            } else if (i == 2) {
                this.tokens.get(i).setPosition(xCoordinate + 145, yCoordinate + 45);
            } else if (i == 3) {
                this.tokens.get(i).setPosition(xCoordinate + 145, yCoordinate + 145);
            }
        }
    }

    /**
     * returns the tokens inside the home box
     * @return list of tokens
     */
    public ArrayList<Token> getTokens(){
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
