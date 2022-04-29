package Presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerPanel extends JPanel {
    DicesPanel dicesPanel;
    JButton rolldice;

    public PlayerPanel(){
        initComponents();
        prepareComponents();
        prepareActions();
    }

    private void initComponents(){
        dicesPanel = new DicesPanel();
        rolldice = new JButton("Roll Dices");
    }

    private void prepareComponents(){
        preparePanel();
        this.add(dicesPanel, BorderLayout.NORTH);
        this.add(rolldice, BorderLayout.SOUTH);
    }

    private void preparePanel(){
        setLayout(new BorderLayout());
    }

    private void prepareActions(){
        rolldice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dicesPanel.actionRoll();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setSize(470, 700);
        setLocation(730, 0);
        setBackground(Color.DARK_GRAY);
    }
}
