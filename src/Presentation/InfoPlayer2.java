package Presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoPlayer2 extends PlayerInfoScreen{
    public InfoPlayer2() {
        prepareElements();
        prepareActions();
    }
    private void prepareActions() {
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wildcardsScreen = new WildcardsScreen();
                wildcardsScreen.setVisible(true);
                setVisible(false);
            }
        });
    }
}