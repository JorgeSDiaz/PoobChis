package Domain;

public class Parchis {
    Dice[] dices;
    Board board;

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
}
