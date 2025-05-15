package Cards;

public class CardData
{
    private String name;
    private String type; // "Monster" or "Spell"
    private int power;
    private String effectId; // Identifier for the card's effect
    // Constructors, getters, and setters

    public CardData(String name, String type, int power, String effectId)
    {
        this.name = name;
        this.type = type;
        this.power = power;
        this.effectId = effectId;
    }

    public int getPower()
    {
        return power;
    }
    
    public String getName()
    {
        return name;
    }
}
