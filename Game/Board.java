package Game;
import Cards.Card;

public class Board
{
    private Card[][] board;
    private int rows;
    private int cols;

    public Board() {
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
}
