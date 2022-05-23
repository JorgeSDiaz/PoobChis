package Domain;

import java.awt.*;
import java.util.ArrayList;

public class Board {
    Box[] boxes;
    ArrayList<String> tokenOne,tokensTwo;
    /**
     * Board builder
     */
    public Board(ArrayList<String> tokensPOne, ArrayList<String> tokensPTwo){
        boxes = new Box[101];
        this.tokenOne = tokensPOne;
        this.tokensTwo = tokensPTwo;
        createSectionPlayerOne();
        createSectionPlayerTwo();
        createSectionPlayerThree();
        createSectionPlayerFour();
        boxes[100] = new Box(155, 155, 263, 268, new Color(255, 180, 237));
    }

    public Board(){
        this(new ArrayList<>(), new ArrayList<>());
    }

    /**
     * Creates the columns and home of player 1
     */
    private void createSectionPlayerOne(){
        boxes[0] = new Home(220, 220, 5, 5, 8, Color.red, tokenOne);
        createFirstColumnPOne();
        createSecondColumnPOne();
        createFinalColumnPOne();
    }

    /**
     * first column of player 1
     */
    private void createFirstColumnPOne(){
        boxes[4] = new Box(70, 30, 230, 5, null);
        boxes[5] = new Box(70, 30, 230, 37, null);
        boxes[6] = new Box(70, 30, 230, 69, null);
        boxes[7] = new Box(70, 30, 230, 101, null);
        boxes[8] = new Box(70, 30, 230, 133, Color.red);
        boxes[9] = new Box(70, 30, 230, 165, null);
        boxes[10] = new Box(70, 30, 230, 197, null);
        boxes[11] = new Box(new int[]{300, 300, 230, 270}, new int[]{260, 230, 230, 260}, 70, 30, null);
    }

    /**
     * second column of player 1
     */
    private void createSecondColumnPOne(){
        boxes[12] = new Box(new int[]{230, 258, 258, 230}, new int[]{235, 260, 305, 305}, 30, 70, null);
        boxes[13] = new Box(30, 70, 197, 235, null);
        boxes[14] = new Box(30, 70, 165, 235, null);
        boxes[15] = new Box(30, 70, 133, 235, Color.gray);
        boxes[16] = new Box(30, 70, 101, 235, null);
        boxes[17] = new Box(30, 70, 69, 235, null);
        boxes[18] = new Box(30, 70, 37, 235, null);
        boxes[19] = new Box(30, 70, 5, 235, null);
    }

    /**
     * final column of player 1
     */
    private void createFinalColumnPOne(){
        boxes[71] = new Box(70, 30, 305, 5, null);
        boxes[72] = new Box(70, 30, 305, 37, Color.red);
        boxes[73] = new Box(70, 30, 305, 69, Color.red);
        boxes[74] = new Box(70, 30, 305, 101, Color.red);
        boxes[75] = new Box(70, 30, 305, 133, Color.red);
        boxes[76] = new Box(70, 30, 305, 165, Color.red);
        boxes[77] = new Box(70, 30, 305, 197, Color.red);
        boxes[78] = new Box(70, 30, 305, 229, Color.red);
    }

    /**
     * Creates the columns and home of player 2
     */
    private void createSectionPlayerTwo(){
        boxes[1] = new Home(220, 220, 5, 464, 25, Color.yellow, tokensTwo);
        createFirstColumnPTwo();
        createSecondColumnPTwo();
        createFinalColumnPTwo();
    }

    /**
     * first column of player 2
     */
    private void createFirstColumnPTwo(){
        boxes[21] = new Box(30, 70, 5, 385, null);
        boxes[22] = new Box(30, 70, 37, 385, null);
        boxes[23] = new Box(30, 70, 69, 385, null);
        boxes[24] = new Box(30, 70, 101, 385, null);
        boxes[25] = new Box(30, 70, 133, 385, Color.yellow);
        boxes[26] = new Box(30, 70, 165, 385, null);
        boxes[27] = new Box(30, 70, 197, 385, null);
        boxes[28] = new Box(new int[]{230, 258, 258, 230}, new int[]{385, 385, 430, 455}, 30, 70, null);
    }

    /**
     * second column of player 2
     */
    private void createSecondColumnPTwo(){
        boxes[29] = new Box(new int[]{300, 265, 230, 300}, new int[]{432, 432, 460, 460}, 30, 70, null);
        boxes[30] = new Box(70, 30, 230, 657, null);
        boxes[31] = new Box(70, 30, 230, 625, null);
        boxes[32] = new Box(70, 30, 230, 593, Color.gray);
        boxes[33] = new Box(70, 30, 230, 561, null);
        boxes[34] = new Box(70, 30, 230, 529, null);
        boxes[35] = new Box(70, 30, 230, 497, null);
        boxes[36] = new Box(70, 30, 230, 465, null);
    }

    /**
     * final column of player 2
     */
    private void createFinalColumnPTwo(){
        boxes[20] = new Box(30, 70, 5, 310, null);
        boxes[79] = new Box(30, 70, 37, 310, Color.yellow);
        boxes[80] = new Box(30, 70, 69, 310, Color.yellow);
        boxes[81] = new Box(30, 70, 101, 310, Color.yellow);
        boxes[82] = new Box(30, 70, 133, 310, Color.yellow);
        boxes[83] = new Box(30, 70, 165, 310, Color.yellow);
        boxes[84] = new Box(30, 70, 197, 310, Color.yellow);
        boxes[85] = new Box(30, 70, 229, 310, Color.yellow);
    }

    /**
     * Creates the columns and home of player 3
     */
    private void createSectionPlayerThree(){
        boxes[2] = new Home(220, 220, 458, 464, 42, Color.blue, new ArrayList<>());
        createFirstColumnPThree();
        createSecondColumnPThree();
        createFinalColumnPThree();
    }

    /**
     * first column of player 3
     */
    private void createFirstColumnPThree(){
        boxes[38] = new Box(70, 30, 380, 657, null);
        boxes[39] = new Box(70, 30, 380, 625, null);
        boxes[40] = new Box(70, 30, 380, 593, null);
        boxes[41] = new Box(70, 30, 380, 561, null);
        boxes[42] = new Box(70, 30, 380, 529, Color.blue);
        boxes[43] = new Box(70, 30, 380, 497, null);
        boxes[44] = new Box(70, 30, 380, 465, null);
        boxes[45] = new Box(new int[]{450, 420, 380, 380}, new int[]{460, 432, 432, 460}, 70, 30, null);
    }

    /**
     * second column of player 3
     */
    private void createSecondColumnPThree(){
        boxes[46] = new Box(new int[]{422, 452, 452, 422}, new int[]{385, 385, 455, 425}, 30, 70, null);
        boxes[47] = new Box(30, 70, 647, 385, null);
        boxes[48] = new Box(30, 70, 615, 385, null);
        boxes[49] = new Box(30, 70, 583, 385, Color.gray);
        boxes[50] = new Box(30, 70, 551, 385, null);
        boxes[51] = new Box(30, 70, 519, 385, null);
        boxes[52] = new Box(30, 70, 487, 385, null);
        boxes[53] = new Box(30, 70, 455, 385, null);
    }

    /**
     * final column of player 3
     */
    private void createFinalColumnPThree(){
        boxes[37] = new Box(70, 30, 305, 657, null);
        boxes[86] = new Box(70, 30, 305, 433, Color.blue);
        boxes[87] = new Box(70, 30, 305, 465, Color.blue);
        boxes[88] = new Box(70, 30, 305, 497, Color.blue);
        boxes[89] = new Box(70, 30, 305, 529, Color.blue);
        boxes[90] = new Box(70, 30, 305, 561, Color.blue);
        boxes[91] = new Box(70, 30, 305, 593, Color.blue);
        boxes[92] = new Box(70, 30, 305, 625, Color.blue);

    }

    /**
     * Creates the columns and home of player 4
     */
    private void createSectionPlayerFour(){
        boxes[3] = new Home(220, 220, 458, 5, 42, Color.green, new ArrayList<>());
        createFirstColumnPFour();
        createSecondColumnPFour();
        createFinalColumnPFour();
    }

    /**
     * first column of player 4
     */
    private void createFirstColumnPFour(){
        boxes[55] = new Box(30, 70, 455, 235, null);
        boxes[56] = new Box(30, 70, 487, 235, null);
        boxes[57] = new Box(30, 70, 519, 235, null);
        boxes[58] = new Box(30, 70, 551, 235, null);
        boxes[59] = new Box(30, 70, 583, 235, Color.green);
        boxes[60] = new Box(30, 70, 615, 235, null);
        boxes[61] = new Box(30, 70, 647, 235, null);
        boxes[62] = new Box(new int[]{422, 452, 452, 422}, new int[]{265, 235, 305, 305}, 30, 70, null);
    }

    /**
     * second column of player 4
     */
    private void createSecondColumnPFour(){
        boxes[63] = new Box(new int[]{420, 450, 380, 380}, new int[]{260, 230, 230, 260}, 70, 30, null);
        boxes[64] = new Box(70, 30, 380, 5, null);
        boxes[65] = new Box(70, 30, 380, 37, null);
        boxes[66] = new Box(70, 30, 380, 69, Color.gray);
        boxes[67] = new Box(70, 30, 380, 101, null);
        boxes[68] = new Box(70, 30, 380, 133, null);
        boxes[69] = new Box(70, 30, 380, 165, null);
        boxes[70] = new Box(70, 30, 380, 197, null);

    }

    /**
     * final column of player 4
     */
    private void createFinalColumnPFour(){
        boxes[54] = new Box(30, 70, 647, 310, null);
        boxes[93] = new Box(30, 70, 423, 310, Color.green);
        boxes[94] = new Box(30, 70, 455, 310, Color.green);
        boxes[95] = new Box(30, 70, 487, 310, Color.green);
        boxes[96] = new Box(30, 70, 519, 310, Color.green);
        boxes[97] = new Box(30, 70, 551, 310, Color.green);
        boxes[98] = new Box(30, 70, 583, 310, Color.green);
        boxes[99] = new Box(30, 70, 615, 310, Color.green);
    }

    /**
     * returns the boxes that compose the board
     * @return Box[] boxes
     */
    public Box[] getBoxes(){
        return boxes;
    }

    /**
     * returns a specific square of those that compose the board.
     * @param position int box number
     * @return Box boxes[position]
     */
    public Box getBox(int position){
        return boxes[position];
    }
}
