package Game;
import Cards.Card;
import Cards.Monster;

import java.util.ArrayList;

public class Board
{
    private Card[][] board;
    private int rows;
    private int cols;

    public Board()
    {
        rows = 4;
        cols = 4;
        board = new Card[rows][cols];

        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                board[i][j] = null;
            }
        }
    }

    public Card getCard(int row, int col)
    {
        return board[row][col];
    }

    public Card[][] getBoard()
    {
        return board;
    }

    public ArrayList<int[]> getMonsterCardPositions()
    {
        ArrayList<int[]> positions = new ArrayList<>();
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++) 
            {
                Card card = board[i][j];
                if (card != null && card instanceof Monster)
                {
                    positions.add(new int[]{i, j});
                }
            }
        }
        return positions;
    }
}
