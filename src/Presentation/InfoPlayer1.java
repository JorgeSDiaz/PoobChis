package Presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoPlayer1 extends PlayerInfoScreen {

    public InfoPlayer1() {
        prepareElements();
        prepareActions();
    }
    private void prepareActions() {
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondPlayer = new InfoPlayer2();
                secondPlayer.setVisible(true);
                setVisible(false);
            }
        });
    }
}