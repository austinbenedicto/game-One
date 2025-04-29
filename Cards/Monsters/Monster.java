package Cards.Monsters;
import Cards.Card;

public abstract class Monster extends Card
{
    public Monster(String name, String description, int health, int attack) 
    {
        super(name, description, health, attack);
    }
}
