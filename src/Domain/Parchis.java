package Domain;

public class Parchis {
    Dice[] dices;
    Board board;

    private static Parchis parchis = null;

    public Parchis(){
        dices = new Dice[]{new Dice(), new Dice()};
        board = new Board();
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
}