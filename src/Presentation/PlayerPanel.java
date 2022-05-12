package Presentation;

import Domain.Dice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerPanel extends JPanel {
    private Dice[] dices;
    private DicesPanel dicesPanel;
    private JButton rolldice;

    public PlayerPanel(Dice[] dices){
        this.dices = dices;
        initComponents();
        prepareComponents();
        prepareActions();
    }

    private void initComponents(){
        dicesPanel = new DicesPanel(dices);
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
        setLocation(700, 0);
        setBackground(Color.DARK_GRAY);
    }
}
