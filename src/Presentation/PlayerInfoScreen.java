package Presentation;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PlayerInfoScreen extends JFrame {
    private ImageIcon icon;
    private JButton next, tokensinfo;
    private JPanel containerTokens, containerButtons, containerName, container;
    private JTextField name;
    private JLabel nameText;
    private WildcardsScreen wildcardsScreen;
    private JToggleButton normal, rocket, vacuum, jumping, advantageous, engineer, random;
    ArrayList<String> tokensSelected = new ArrayList<String>();
    private int numberPlayers;

    /**
     * Builder of the player screen that prepares the elements and the actions
     */
    public PlayerInfoScreen(int numberplayers) {
        numberPlayers = numberplayers;
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
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
        normal = new JToggleButton("normal",(new ImageIcon("images/normal.png")));
        normal.setSelectedIcon(new ImageIcon("images/selected.png"));
        rocket = new JToggleButton("rocket",(new ImageIcon( "images/rocket.png")));
        rocket.setSelectedIcon(new ImageIcon("images/selected.png"));
        vacuum = new JToggleButton("vacuum",(new ImageIcon("images/vacuum.png")));
        vacuum.setSelectedIcon(new ImageIcon("images/selected.png"));
        jumping = new JToggleButton("jumping",(new ImageIcon("images/jumping.png")));
        jumping.setSelectedIcon(new ImageIcon("images/selected.png"));
        advantageous = new JToggleButton("advantageous",(new ImageIcon("images/advantageous.png")));
        advantageous.setSelectedIcon(new ImageIcon("images/selected.png"));
        engineer = new JToggleButton("engineer",(new ImageIcon("images/engineer.png")));
        engineer.setSelectedIcon(new ImageIcon("images/selected.png"));
        random = new JToggleButton("random",(new ImageIcon("images/random.png")));
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
     * Prepare the buttons(next and tokens info) in the south
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
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numberPlayers == 1) {
                    if (name.getText().equals("") || (tokensSelected.size() == 1  && !(tokensSelected.contains(random.getName())))
                            || tokensSelected.size() > 1 && tokensSelected.size() < 4) {
                        JOptionPane.showMessageDialog(null, "Please choose your tokens or enter your name");
                    } else {
                        getNameP1();
                        getTokensP1();
                        wildcardsScreen = new WildcardsScreen(getNameP1(), getTokensP1(), getNameP2(), getTokensP2());
                        wildcardsScreen.setVisible(true);
                        setVisible(false);
                    }
                } else if (numberPlayers == 2) {
                    if (name.getText().equals("") || (tokensSelected.size() == 1  && !(tokensSelected.contains(random.getName())))
                            || tokensSelected.size() > 1 && tokensSelected.size() < 4) {
                        JOptionPane.showMessageDialog(null, "Please choose your tokens or enter your name");
                    } else {
                        getNameP2();
                        getTokensP2();
                        tokensSelected.clear();
                        next.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                PlayerInfoScreen playerInfoScreen = new PlayerInfoScreen(1);
                                playerInfoScreen.setVisible(true);
                                setVisible(false);
                            }
                        });
                    }
                }
            }
        });
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
        random.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JToggleButton[] tokens = new JToggleButton[6];
                tokens[0] = normal;
                tokens[1] = rocket;
                tokens[2] = vacuum;
                tokens[3] = jumping;
                tokens[4] = advantageous;
                tokens[5] = engineer;
                if(random.isSelected()){
                    for(int i = 0; i <= 5; i++){
                        tokens[i].setSelected(false);
                        tokensSelected.clear();
                    }
                    tokensSelected.add("normal");
                    tokensSelected.add("rocket");
                    tokensSelected.add("vacuum");
                    tokensSelected.add("jumping");
                } else{tokensSelected.remove(random.getText());}
            }
        });
        normal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TokensSelected(normal);
            }
        });
        rocket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TokensSelected(rocket);
            }
        });
        vacuum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TokensSelected(vacuum);
            }
        });
        jumping.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TokensSelected(jumping);
            }
        });
        advantageous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TokensSelected(advantageous);
            }
        });
        engineer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TokensSelected(engineer);
            }
        });

    }

    /**
     * Verifies that the selected Tokens are 4 (or 1 in case of selecting random), sends an error message in case of trying to choose more
     * @param token= jtogglebutton selected (except random)
     */
    private void TokensSelected(JToggleButton token) {
        if (random.isSelected()) {
            token.setSelected(false);
        }
        else if (token.isSelected()) {
            if (tokensSelected.size() <= 3) {
                tokensSelected.add(token.getText());
            } else {
                if (token.isSelected() == false) {
                    tokensSelected.remove(token.getText());
                } else {
                    token.setSelected(false);
                    JOptionPane.showMessageDialog(null, "Just pick 4 tokens >:(");
                }
            }
        } else if (token.isSelected() == false) { tokensSelected.remove(token.getText()); }
    }

    /**
     * Obtains the name by the player 2
     * @return An arraylist with the name of the player in the first position and the chosen tokens
     */
    public String getNameP2(){
        return (name.getText());
    }

    /**
     * Obtains the name by the player single o player 1
     * @return An arraylist with the name of the player in the first position and the chosen tokens
     */
    public String getNameP1(){
        return(name.getText());
    }
    /**
     * Obtains in an arraylist the tokens entered by the player single o player 1
     * @return An arraylist with the name of the player in the first position and the chosen tokens
     */
    public ArrayList getTokensP1(){
        return(tokensSelected);
    }
    /**
     * Obtains in an arraylist the tokens entered by the player 2
     * @return An arraylist with the name of the player in the first position and the chosen tokens
     */
    public ArrayList getTokensP2(){
        return(tokensSelected);
    }
}