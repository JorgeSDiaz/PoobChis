package Presentation;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WildcardsScreen extends JFrame {
    private ImageIcon icon;
    JPanel container, containerWildcards, containerButtons, containerName;
    JLabel nameText;
    JToggleButton moveAlong, back, goToJail, getOutOfJail, playDouble, removeToken, breakBlocking, immortal, mutate;
    JButton play, wildcardsInfo;
    ParchisGUI interfaz;

    public WildcardsScreen(){
        prepareElements();
        prepareActions();
    }

    /**
     * Prepare the different elements of the wildcards screen
     */
    private void prepareElements() {
        setTitle("Wildcards");
        setSize(632, 630);
        setResizable(false);
        setLocationRelativeTo(null);
        prepareName();
        prepareWildcards();
        prepareButtons();
    }
    private void prepareWildcards() {
        containerWildcards = new JPanel();
        containerWildcards.setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new TitledBorder("Choose your wildcards to game (4 wildcards)")));
        containerWildcards.setLayout(new GridLayout(3, 2, 3, 3));
        moveAlong = new JToggleButton("Move along");
        back = new JToggleButton("Back");
        goToJail = new JToggleButton("Go to jail");
        getOutOfJail = new JToggleButton("Get out of jail");
        playDouble = new JToggleButton("Play double");
        removeToken = new JToggleButton("Remove token");
        breakBlocking = new JToggleButton("Break blocking");
        immortal = new JToggleButton("Immortal");
        mutate = new JToggleButton("Mutate");
        containerWildcards.add(moveAlong);
        containerWildcards.add(back);
        containerWildcards.add(goToJail);
        containerWildcards.add(getOutOfJail);
        containerWildcards.add(playDouble);
        containerWildcards.add(removeToken);
        containerWildcards.add(breakBlocking);
        containerWildcards.add(immortal);
        containerWildcards.add(mutate);
        container.add(containerWildcards, BorderLayout.CENTER);
    }
    private void prepareButtons(){
        containerButtons = new JPanel();
        play = new JButton("Play ☺");
        play.setBackground(new Color(248,186,255));
        wildcardsInfo = new JButton("Wildcards information");
        containerButtons.add(wildcardsInfo);
        containerButtons.add(play);
        container.add(containerButtons, BorderLayout.SOUTH);
    }

    private void prepareName() {
        container = new JPanel();
        add(container);
        container.setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new TitledBorder("╰(*´︶`*)╯")));
        container.setLayout(new BorderLayout());
        containerName = new JPanel();
        nameText = new JLabel("Wildcards POOBchis");
        nameText.setBounds(10, 10, 100, 30);
        containerName.add(nameText);
        container.add(containerName, BorderLayout.NORTH);
    }
    private void prepareActions(){
        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interfaz = new ParchisGUI();
                interfaz.setVisible(true);
                setVisible(false);
            }
        });
        wildcardsInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "⠀♡⠀Move along:⠀The token that has this wild card advances 5 spaces automatically. \n " +
                                "\n⠀♡⠀Back:⠀The token that has this wild card moves back 5 spaces automatically.\n" +
                                "\n⠀♡⠀Go to jail:⠀The tile that has this joker will go directly to jail.\n" +
                                "\n⠀♡⠀Get out of jail:⠀The team of the color corresponding to the token that \n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀acquires this wild card, will be able to release one of its pieces \n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀(only if it has pieces in jail).\n"+
                                "\n⠀♡⠀Play double:⠀The player who owns the token to which this wild card appears will\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀have an additional turn, that is, he will be able to play the dice again.\n"+
                                "\n⠀♡⠀Remove token:⠀Your opponent's most advanced token is sent to jail.\n"+
                                "\n⠀♡⠀Break lock:⠀If there are blockades on the board, the blockade closest to the\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀space where the wild card was obtained is broken.\n"+
                                "\n⠀♡⠀Immortal:⠀If this wild card is obtained, no one can kill the tile that obtained it.\n"+
                                "\n⠀♡⠀Mutate:⠀The token changes type, becoming one randomly selected from those that\n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀the player in turn does not have.","wildcards info " , JOptionPane.DEFAULT_OPTION, icon);

            }
        });
    }
}
