package Cards;

public abstract class Card 
{
    public String name;
    public String description;
    public int health;
    public int attack;

    public Card(String name, String description, int health, int attack) 
    {
        this.name = name;
        this.description = description;
        this.health = health;
        this.attack = attack;
    }
}
