package Cards.Effects;
import Cards.Card;

public class DamageAllEnemies implements Effect
{
    private int damage;

    public DamageAllEnemies(int damage)
    {
        this.damage = damage;
    }

    @Override
    public void apply(/*GameState gameState,*/ Card owner)
    {
        // Assuming we have a method to get all enemies and apply damage
        // for (Enemy enemy : gameState.getEnemies()) {
        //     enemy.takeDamage(damage);
        // }
        System.out.println(owner.getName() + " deals " + damage + " damage to all enemies.");
    }
    
}
