package Presentation;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerInfoScreen extends JFrame {
    private JButton play;
    private JPanel containerTokens;
    private JPanel containerButtons;
    private JPanel containerName;

    private JTextField name;
    private JLabel nameText;

    private JPanel container;
    private ParchisGUI interfaz;

    /**
     * Builder of the Single player screen that prepares the elements and the actions
     */
    public PlayerInfoScreen() {
        prepareElements();
        prepareActions();
    }

    /**
     * Prepare the different elements of the single player screen
     */
    private void prepareElements() {
        setTitle("Player info");
        setSize(632, 630);
        setResizable(false);
        setLocationRelativeTo(null);
        prepareName();
        prepareTokens();
        prepareButtons();
    }

    /**
     * Prepare the center with the tokens game
     */
    private void prepareTokens() {
        containerTokens = new JPanel();
        containerTokens.setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new TitledBorder("Choose your tokens to game")));
        containerTokens.setLayout(new GridLayout(3, 2, 3, 3));
        Button normal = new Button("Normal");
        Button rocket = new Button("Rocket");
        Button vacuum = new Button("Vacuum");
        Button jumping = new Button("Jumping");
        Button advantageous = new Button("Advantageous");
        Button engineer = new Button("Engineer");
        containerTokens.add(normal);
        containerTokens.add(rocket);
        containerTokens.add(vacuum);
        containerTokens.add(jumping);
        containerTokens.add(advantageous);
        containerTokens.add(engineer);
        container.add(containerTokens, BorderLayout.CENTER);
    }

    /**
     * Prepare the header with the
     */
    private void prepareButtons() {
        containerButtons = new JPanel();
        play = new JButton("¡ Play !");
        containerButtons.add(play);
        container.add(containerButtons, BorderLayout.SOUTH);
    }

    /**
     * prepare the header with the JtextField for player name
     */
    private void prepareName() {
        container = new JPanel();
        add(container);
        container.setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new TitledBorder("╰(*´︶`*)╯")));
        container.setLayout(new BorderLayout());
        containerName = new JPanel();
        nameText = new JLabel("Enter the name of player: ");
        nameText.setBounds(10, 10, 100, 30);
        containerName.add(nameText);
        name = new JTextField(8);
        name.setBounds(120, 10, 150, 20);
        containerName.add(name);
        container.add(containerName, BorderLayout.NORTH);
    }

    private void prepareActions() {
        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interfaz = new ParchisGUI();
                setVisible(false);
    }
    });
    }
}