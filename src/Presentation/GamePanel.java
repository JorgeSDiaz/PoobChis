package Presentation;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setSize(730, 700);
        setBackground(Color.white);
    }
}
