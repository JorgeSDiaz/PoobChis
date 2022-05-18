package Domain;

public class Parchis {
    Dice[] dices;
    Board board;
    int currentPlayer;

    private static Parchis parchis = null;

    public Parchis(){
        dices = new Dice[]{new Dice(), new Dice()};
        board = new Board();
        currentPlayer = 0;
    }

    public Dice[] getDices(){
        return dices;
    }

    public Board getBoard(){
        return board;
    }

    public static Parchis getParchis() {
        if (parchis == null) {
            parchis = new Parchis();
        }
        return (parchis);
    }

    public void play(){
        Home home = (Home) board.getBox(currentPlayer);
        if ((dices[0].getValue() == (byte) 5 || dices[1].getValue() == (byte) 5 ||
                (dices[0].getValue() + dices[1].getValue()) == 5) && home.getCantToken() != 0){
            int cantOut = dices[0].getValue() != dices[1].getValue() ? 1 : 2;
            int starPosition = 4 - (home.getCantToken());
            for (int i = starPosition; i < starPosition + cantOut; i++){
                home.getTokens()[i].setXCoordinate(board.getBox(home.getStartBox()).getXCoordinate());
                home.getTokens()[i].setYCoordinate(board.getBox(home.getStartBox()).getYCoordinate());
            }
        }
    }
}