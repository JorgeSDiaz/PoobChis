package Presentation;

import javax.swing.*;
import java.awt.*;

public class PlayerPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setSize(470, 700);
        setLocation(730, 0);
        setBackground(Color.DARK_GRAY);
    }
}
