package Domain;

import java.util.ArrayList;

public class Parchis {
    Dice[] dices;
    Board board;
    int currentPlayer;
    ArrayList<ArrayList<Token>> tokensInGame;
    ArrayList<ArrayList<String>> tokensPlayers;

    private static Parchis parchis = null;

    /**
     * parchis builder
     */
    public Parchis(ArrayList<ArrayList<String>> tokensPlayers){
        dices = new Dice[]{new Dice(), new Dice()};
        this.tokensPlayers = tokensPlayers;
        tokensInGame = new ArrayList<ArrayList<Token>>();
        intiTokensArray();
        initBoard(tokensPlayers.get(0), tokensPlayers.get(1));
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

    public static Parchis getParchis(ArrayList<ArrayList<String>> tokensPlayers) {
        if (parchis == null) {
            parchis = new Parchis(tokensPlayers);
        }
        return (parchis);
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

                    moveToken(cantTokens, newBox);
                }
            } else {
                Token token = tokensInGame.get(currentPlayer).get(0);
                int newBox = Math.min(token.getBox() + dices[0].getValue() + dices[1].getValue(), 100);
                cantTokens = board.getBox(newBox).getCantToken();

                moveToken(cantTokens, newBox);
            }
        }

        //if (currentPlayer == 0){
            //currentPlayer = 1;
        //} else {
            //currentPlayer = 0;
        //}
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
    }
}