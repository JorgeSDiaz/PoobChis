package Presentation;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerInfoScreen extends JFrame {
    private ImageIcon icon;
    protected JButton next, tokensinfo;
    private JPanel containerTokens, containerButtons, containerName, container;
    private JTextField name;
    private JLabel nameText;
    protected WildcardsScreen wildcardsScreen;
    protected InfoPlayer2 secondPlayer;
    private JToggleButton normal, rocket, vacuum, jumping, advantageous, engineer, random;
    /**
     * Builder of the player screen that prepares the elements and the actions
     */
    public PlayerInfoScreen() {
        prepareElements();
        prepareActions();
    }

    /**
     * Prepare the different elements of the player screen
     */
    void prepareElements() {
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
        containerTokens.setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new TitledBorder("Choose your tokens to game (4 tokens)")));
        containerTokens.setLayout(new GridLayout(3, 2, 3, 3));
        normal = new JToggleButton(new ImageIcon("images/normal.png"));
        normal.setSelectedIcon(new ImageIcon("images/selected.png"));
        rocket = new JToggleButton(new ImageIcon("images/rocket.png"));
        rocket.setSelectedIcon(new ImageIcon("images/selected.png"));
        vacuum = new JToggleButton(new ImageIcon("images/vacuum.png"));
        vacuum.setSelectedIcon(new ImageIcon("images/selected.png"));
        jumping = new JToggleButton(new ImageIcon("images/jumping.png"));
        jumping.setSelectedIcon(new ImageIcon("images/selected.png"));
        advantageous = new JToggleButton(new ImageIcon("images/advantageous.png"));
        advantageous.setSelectedIcon(new ImageIcon("images/selected.png"));
        engineer = new JToggleButton(new ImageIcon("images/engineer.png"));
        engineer.setSelectedIcon(new ImageIcon("images/selected.png"));
        random = new JToggleButton(new ImageIcon("images/random.png"));
        random.setSelectedIcon(new ImageIcon("images/selected.png"));
        containerTokens.add(normal);
        containerTokens.add(rocket);
        containerTokens.add(vacuum);
        containerTokens.add(jumping);
        containerTokens.add(advantageous);
        containerTokens.add(engineer);
        containerTokens.add(random);
        container.add(containerTokens, BorderLayout.CENTER);
    }

    /**
     * Prepare the buttons(play and tokens info)
     */
    private void prepareButtons() {
        containerButtons = new JPanel();
        next = new JButton("Next");
        next.setBackground(new Color(248,186,255));
        tokensinfo = new JButton("Tokens information");
        containerButtons.add(tokensinfo);
        containerButtons.add(next);
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
    /**
     * Prepare player info screen actions
     */
    private void prepareActions() {
        tokensinfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        " ♥⠀Normal:⠀It advances along the board according to the value indicated by the player \n"+
                                "\n ♥⠀Rocket:⠀This token jumps to the nearest insurance without the need for the value \n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀of the dice to be valid (it is only used 2 times during the game) \n " +
                                "\n ♥⠀Vacuum:⠀Bring the token that is spaces back closest to it; and takes it to the \n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀same square where it is, forming a blockade (can be used 2 times \n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀during the game, a range of 12 squares maximum) \n"+
                                "\n ♥⠀Jumping:⠀This token can jump the blocks that are in the way, that is, it will \n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀advance the amount on the dice regardless of the blocks formed \n" +
                                "\n ♥⠀Advantageous:⠀Every two turns of the player the piece will advance to 3 squares \n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀without the player indicating it or falling 3 in the value of the dice. \n"+
                                "\n ♥⠀Engineer:⠀Its power is to convert the square where it lands into a safe square, \n" +
                                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀said square will be safe for all other pieces. \n","tokens info " , JOptionPane.DEFAULT_OPTION, icon);

            }
        });
    }
}