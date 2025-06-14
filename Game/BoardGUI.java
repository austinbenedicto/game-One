package Game;

import Cards.Card;

import javax.swing.*;
import java.awt.*;

public class BoardGUI extends JFrame {
    private Board board;
    private JButton[][] cardButtons;
    private JButton[] evolverSlots;

    public BoardGUI(Board board) {
        this.board = board;
        this.cardButtons = new JButton[4][4];
        this.evolverSlots = new JButton[2];

        setTitle("Card Board");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));

        // Left evolver slot
        evolverSlots[0] = new JButton("Evolver 1");
        evolverSlots[0].setPreferredSize(new Dimension(80, 120));
        JPanel leftPanel = new JPanel(new GridBagLayout());
        leftPanel.add(evolverSlots[0]);
        mainPanel.add(leftPanel, BorderLayout.WEST);

        // Right evolver slot
        evolverSlots[1] = new JButton("Evolver 2");
        evolverSlots[1].setPreferredSize(new Dimension(80, 120));
        JPanel rightPanel = new JPanel(new GridBagLayout());
        rightPanel.add(evolverSlots[1]);
        mainPanel.add(rightPanel, BorderLayout.EAST);

        // Center board panel (4x4)
        JPanel centerPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                JButton btn = new JButton();
                btn.setPreferredSize(new Dimension(80, 120));
                cardButtons[row][col] = btn;
                centerPanel.add(btn);
            }
        }
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        add(mainPanel);

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
        // Optionally update evolver slots here if needed
    }
}