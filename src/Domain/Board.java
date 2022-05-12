package Domain;

import java.awt.*;

public class Board {
    Box[] boxes;

    public Board(){
        boxes = new Box[101];
        createSectionPlayerOne();
        createSectionPlayerTwo();
    }

    private void createSectionPlayerOne(){
        boxes[0] = new Home(220, 220, 5, 5, 8, Color.red);
        createFirstColumnPOne();
        createSecondColumnPOne();
        createFinalColumnPOne();
    }

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

    private void createSecondColumnPOne(){
        boxes[12] = new Box(new int[]{230, 258, 258, 230}, new int[]{235, 260, 305, 305}, 30, 70, null);
        boxes[13] = new Box(30, 70, 197, 235, null);
        boxes[14] = new Box(30, 70, 165, 235, null);
        boxes[15] = new Box(30, 70, 133, 235, Color.GRAY);
        boxes[16] = new Box(30, 70, 101, 235, null);
        boxes[17] = new Box(30, 70, 69, 235, null);
        boxes[18] = new Box(30, 70, 37, 235, null);
        boxes[19] = new Box(30, 70, 5, 235, null);
    }

    private void createFinalColumnPOne(){
        boxes[68] = new Box(70, 30, 305, 5, null);
        boxes[69] = new Box(70, 30, 305, 37, Color.red);
        boxes[70] = new Box(70, 30, 305, 69, Color.red);
        boxes[71] = new Box(70, 30, 305, 101, Color.red);
        boxes[72] = new Box(70, 30, 305, 133, Color.red);
        boxes[73] = new Box(70, 30, 305, 165, Color.red);
        boxes[74] = new Box(70, 30, 305, 197, Color.red);
        boxes[75] = new Box(70, 30, 305, 229, Color.red);
    }

    private void createSectionPlayerTwo(){
        boxes[1] = new Home(220, 220, 5, 464, 25, Color.YELLOW);
        createFirstColumnPTwo();
        createSecondColumnPTwo();
        //createFinalColumnPTwo();
    }

    private void createFirstColumnPTwo(){
        boxes[21] = new Box(30, 70, 5, 385, null);
        boxes[22] = new Box(30, 70, 37, 385, null);
        boxes[23] = new Box(30, 70, 69, 385, null);
        boxes[24] = new Box(30, 70, 101, 385, null);
        boxes[25] = new Box(30, 70, 133, 385, Color.YELLOW);
        boxes[26] = new Box(30, 70, 165, 385, null);
        boxes[27] = new Box(30, 70, 197, 385, null);
        boxes[28] = new Box(new int[]{230, 258, 258, 230}, new int[]{385, 385, 430, 455}, 70, 30, null);
    }

    private void createSecondColumnPTwo(){
        boxes[29] = new Box(new int[]{300, 265, 230, 300}, new int[]{432, 432, 460, 460}, 30, 70, null);
        boxes[30] = new Box(70, 30, 230, 657, null);
        boxes[31] = new Box(70, 30, 230, 625, null);
        boxes[32] = new Box(70, 30, 230, 593, Color.GRAY);
        boxes[33] = new Box(70, 30, 230, 561, null);
        boxes[34] = new Box(70, 30, 230, 529, null);
        boxes[35] = new Box(70, 30, 230, 497, null);
        boxes[36] = new Box(70, 30, 230, 465, null);
    }

    public Box[] getBoxes(){
        return boxes;
    }
}
