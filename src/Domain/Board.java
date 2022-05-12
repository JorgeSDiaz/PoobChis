package Domain;

import java.awt.*;

public class Board {
    Box[] boxes;

    public Board(){
        boxes = new Box[101];
        createSectionPlayerOne();
    }

    private void createSectionPlayerOne(){
        boxes[0] = new Home(70, 30, 5, 310, 8, Color.red);
        boxes[4] = new Box(70, 30, 230, 5, null);
        boxes[5] = new Box(70, 30, 230, 37, null);
        boxes[6] = new Box(70, 30, 230, 69, null);
        boxes[7] = new Box(70, 30, 230, 101, null);
        boxes[8] = new Box(70, 30, 230, 133, Color.red);
        boxes[9] = new Box(70, 30, 230, 165, null);
        boxes[10] = new Box(70, 30, 230, 197, null);
        boxes[11] = new Box(new int[]{300, 300, 230, 270}, new int[]{260, 230, 230, 260}, 70, 30, null);
    }
}
