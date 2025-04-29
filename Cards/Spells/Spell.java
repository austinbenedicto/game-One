package Cards.Spells;
import Cards.Card;

public abstract class Spell extends Card
{
    public Spell(String name, String description, int health, int attack) 
    {
        super(name, description, health, attack);
    
    }
}
