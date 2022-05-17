package Presentation;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WildcardsScreen extends JFrame {
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
    }
}
