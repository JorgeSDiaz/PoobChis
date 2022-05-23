package Domain;

import java.awt.*;
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
    public Parchis(ArrayList tokensPlayerOne, ArrayList tokensPlayerTwo){
        dices = new Dice[]{new Dice(), new Dice()};
        tokensInGame = new ArrayList<ArrayList<Token>>();
        intiTokensArray();
        initBoard(tokensPlayerOne,tokensPlayerTwo);
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

    private void initBoard(ArrayList<String> playerOne, ArrayList<String> playerTwo){
        board = new Board(playerOne, playerTwo);
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

    public static Parchis getParchis(ArrayList tokensPlayerOne, ArrayList tokensPlayerTwo) {
        if (parchis == null) {
            parchis = new Parchis(tokensPlayerOne,tokensPlayerTwo);
        }
        return (parchis);
    }

    public int getCurrentPlayer(){
        return currentPlayer;
    }

    /**
     * Method that handles conditions when playing the game
     */
    public void play(){
        Home home = (Home) board.getBox(currentPlayer);
        int cantTokens = 0;
        if (home.getCantToken() != 0){
            cantTokens = board.getBox(home.getStartBox()).getCantToken();
            if (cantTokens < 2){
                if (dices[0].getValue() == 5 || dices[1].getValue() == 5 ||
                        (dices[0].getValue() + dices[1].getValue()) == 5){
                    outOfHome(cantTokens);
                } else if (cantTokens > 0){
                    Token token = tokensInGame.get(currentPlayer).get(0);
                    int newBox = Math.min(token.getBox() + dices[0].getValue() + dices[1].getValue(), 100);
                    cantTokens = board.getBox(newBox).getCantToken();

                    if (token instanceof Advantageous && token.getTurns() == 3){
                        moveToken(cantTokens, token.getBox() + 3);
                        token.resetTurns();
                    } else if (token instanceof Engineer){
                        board.getBox(token.getBox()).setColor(Color.black);
                        board.getBox(newBox).setColor(Color.gray);
                    }

                    moveToken(cantTokens, newBox);
                }
            } else {
                Token token = tokensInGame.get(currentPlayer).get(0);
                int newBox = Math.min(token.getBox() + dices[0].getValue() + dices[1].getValue(), 100);
                cantTokens = board.getBox(newBox).getCantToken();

                moveToken(cantTokens, newBox);
            }
        }
        changeTurn(dices[0].getValue(), dices[1].getValue());
    }

    private void outOfHome(int cantTokens){
        Home home = (Home) board.getBox(currentPlayer);
        int position = home.cantToken - 1;
        int xPosit = board.getBox(home.getStartBox()).getXCoordinate() + 3 + (35 * cantTokens);
        int yPosit = board.getBox(home.getStartBox()).getYCoordinate() + 2;

        Token token = home.getTokens().get(position);
        token.moveTo(xPosit, yPosit, home.getStartBox());

        tokensInGame.get(currentPlayer).add(token);
        board.getBox(home.getStartBox()).plusCantToken(1);
        home.minusCantToken(1);
    }

    private void moveToken(int cantTokens, int newBox){
        Token token = tokensInGame.get(currentPlayer).get(0);
        int xPosit = (board.getBox(newBox).getXCoordinate() + 3 + (35 * cantTokens));
        int yPosit = (board.getBox(newBox).getYCoordinate() + 2);

        token.moveTo(xPosit, yPosit, newBox);

        if (board.getBox(newBox) instanceof Advance){
            moveToken(cantTokens, token.getBox() + 5);
        } else if (board.getBox(newBox) instanceof Back){
            moveToken(cantTokens, token.getBox() - 5);
        }
    }

    private void changeTurn(int valueOne, int valueTwo){
        if (currentPlayer == 0 && valueOne != valueTwo){
            currentPlayer = 1;
        } else if (currentPlayer == 1 && valueOne != valueTwo){
            currentPlayer = 0;
        }
    }
}