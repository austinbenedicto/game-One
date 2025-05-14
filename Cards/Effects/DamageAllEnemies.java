package Cards.Effects;
import Cards.Card;

public class DamageAllEnemies implements Effect
{
    private int damage;

    public DamageAllEnemies(int damage) {
        this.damage = damage;
    }

    @Override
    public void apply(/*GameState gameState,*/ Card owner) {
        // Logic to deal damage to all enemies
        // for (Enemy enemy : gameState.getEnemies()) {
        //     enemy.takeDamage(damage);
        // }
    }
    
}
