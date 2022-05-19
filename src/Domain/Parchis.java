package Domain;

import java.util.ArrayList;

public class Parchis {
    Dice[] dices;
    Board board;
    int currentPlayer;
    ArrayList<ArrayList<Token>> tokensInGame;

    private static Parchis parchis = null;

    /**
     * parchis builder
     */
    public Parchis(){
        dices = new Dice[]{new Dice(), new Dice()};
        board = new Board();
        tokensInGame = new ArrayList<ArrayList<Token>>();
        intiTokensArray();
        currentPlayer = 0;
    }

    /**
     * initializes the array that will contain the chips that are in play, out of the home
     */
    private void intiTokensArray(){
        for (int i = 0; i < 2; i++){
            ArrayList<Token> arrayList = new ArrayList<Token>();
            tokensInGame.add(arrayList);
        }
    }

    /**
     * Return the arrangement with the two dice with which the game is played.
     * @return Two dices
     */
    public Dice[] getDices(){
        return dices;
    }

    /**
     * Return the board
     * @return Board
     */
    public Board getBoard(){
        return board;
    }

    public static Parchis getParchis() {
        if (parchis == null) {
            parchis = new Parchis();
        }
        return (parchis);
    }

    /**
     * Method that handles conditions when playing the game
     */
    public void play(){
        Home home = (Home) board.getBox(currentPlayer);
        if (home.getCantToken() != 0){
            int cantTokensStartBox = board.getBox(home.getStartBox()).getCantToken();
            if (cantTokensStartBox < 2){
                if (dices[0].getValue() == 5 || dices[1].getValue() == 5 ||
                        (dices[0].getValue() + dices[1].getValue()) == 5){
                    int position = home.cantToken - 1;
                    Token token = home.getTokens()[position];
                    token.setXCoordinate(board.getBox(home.getStartBox()).getXCoordinate()
                            + 3 + (35 * cantTokensStartBox));
                    token.setYCoordinate(board.getBox(home.getStartBox()).getYCoordinate() + 2);
                    token.setBox(home.getStartBox());
                    tokensInGame.get(currentPlayer).add(token);
                    board.getBox(home.getStartBox()).plusCantToken(1);
                    home.minusCantToken(1);
                } else if (cantTokensStartBox > 0){
                    Token token = tokensInGame.get(currentPlayer).get(0);
                    int newBox = Math.min(token.getBox() + dices[0].getValue() + dices[1].getValue(), 100);
                    token.setBox(newBox);
                    token.setXCoordinate((board.getBox(newBox).getXCoordinate() + 3));
                    token.setYCoordinate((board.getBox(newBox).getYCoordinate() + 2));
                }
            } else {
                Token token = tokensInGame.get(currentPlayer).get(0);
                int newBox = token.getBox() + dices[0].getValue() + dices[1].getValue();
                token.setBox(newBox);
                token.setXCoordinate((board.getBox(newBox).getXCoordinate() + 3));
                token.setYCoordinate((board.getBox(newBox).getYCoordinate() + 2));
            }
        }

        //if (currentPlayer == 0){
            //currentPlayer = 1;
        //} else {
            //currentPlayer = 0;
        //}
    }
}