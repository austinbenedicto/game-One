package Cards.Effects;

public class Nothing implements Effect
{
    @Override
    public void apply(Game.Board board, Cards.Card owner)
    {
        // This effect does nothing.
    }

}
