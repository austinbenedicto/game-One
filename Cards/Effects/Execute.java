package Cards.Effects;

import Cards.Card;
import Cards.Monster;
import Game.Board;
import java.util.Scanner;

public class Execute implements Effect
{
    private int damage;

    public Execute(int damage)
    {
        this.damage = damage;
    }

    @Override
    public void apply(Board board, Card owner)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row of the target card (0-" + (board.getBoard().length - 1) + "): ");
        int row = scanner.nextInt();
        System.out.println("Enter the column of the target card (0-" + (board.getBoard()[0].length - 1) + "): ");
        int col = scanner.nextInt();

        Monster target = (Monster) board.getCard(row, col);
        if (target != null) {
            target.setAlive(false);
            System.out.println("Target at (" + row + "," + col + ") has been executed.");
        } else {
            System.out.println("No card found at that position.");
        }
    }
    
}
