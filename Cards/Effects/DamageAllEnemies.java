package Cards.Effects;
import Cards.Card;
import Cards.Monster;
import Game.Board;

public class DamageAllEnemies implements Effect
{
    private int damage;

    public DamageAllEnemies(int damage)
    {
        this.damage = damage;
    }

    @Override
    public void apply(Board board, Card owner)
    {
       for(int i = 0; i < board.getMonsterCardPositions().size(); i++)
         {
            int[] position = board.getMonsterCardPositions().get(i);
              
            Card card = board.getCard(position[0], position[1]);

            if(card instanceof Monster && card != owner)
            {
                Monster monster = (Monster) card;
                monster.setAlive(owner.getPower());
            }
         }
    }
    
}
