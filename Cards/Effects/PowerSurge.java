package Cards.Effects;

import Game.Board;

public class PowerSurge implements Effect
{
    private int powerIncrease;

    public PowerSurge(int powerIncrease)
    {
        this.powerIncrease = powerIncrease;
    }

    @Override
    public void apply(Game.Board board, Cards.Card owner)
    {
        for(int i = 0; i < board.getMonsterCardPositions().size(); i++)
        {
            int[] position = board.getMonsterCardPositions().get(i);
            Cards.Card card = board.getCard(position[0], position[1]);

            if (card != null && card instanceof Cards.Monster)
            {
                Cards.Monster monster = (Cards.Monster) card;
                monster.setPower(2);
            }
        }
    }
    
}
