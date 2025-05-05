import Cards.Card;
import items.relics.relic;

public class Board
{
    private Card[][] board;
    private int rows;
    private int cols;

    private relic[] redRelics = new relic[3];
    private relic[] blueRelics = new relic[3];

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        board = new Card[rows][cols];
    }

}
