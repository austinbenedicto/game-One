package Game;

import Cards.Card;

import javax.swing.*;
import java.awt.*;

public class BoardGUI extends JFrame {
    private Board board;
    private JButton[][] cardButtons;
    private JButton[] topEvolvers;
    private JButton[] bottomEvolvers;

    public BoardGUI(Board board) {
        this.board = board;
        this.cardButtons = new JButton[4][4];
        this.topEvolvers = new JButton[2];
        this.bottomEvolvers = new JButton[2];

        setTitle("Card Board");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top evolver panel
        JPanel topPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        for (int i = 0; i < 2; i++) {
            topEvolvers[i] = new JButton("Evolver");
            topPanel.add(topEvolvers[i]);
        }
        add(topPanel, BorderLayout.NORTH);

        // Center board panel
        JPanel centerPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                JButton btn = new JButton();
                btn.setPreferredSize(new Dimension(80, 120));
                cardButtons[row][col] = btn;
                centerPanel.add(btn);
            }
        }
        add(centerPanel, BorderLayout.CENTER);

        // Bottom evolver panel
        JPanel bottomPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        for (int i = 0; i < 2; i++) {
            bottomEvolvers[i] = new JButton("Evolver");
            bottomPanel.add(bottomEvolvers[i]);
        }
        add(bottomPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        updateBoard();
    }

    public void updateBoard() {
        Card[][] cards = board.getBoard();
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                Card card = cards[row][col];
                if (card != null) {
                    cardButtons[row][col].setText(card.getName());
                } else {
                    cardButtons[row][col].setText("");
                }
            }
        }
    }
}