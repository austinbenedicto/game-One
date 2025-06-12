package Cards.Effects;
import Cards.Card;
import Game.Board;

public interface Effect
{
    void apply(Board board, Card owner);
}
