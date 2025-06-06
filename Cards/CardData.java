package Cards;

public class CardData
{
    private String name;
    private String type;
    private String affiliation;
    private int power;
    private String effectId;

    public CardData(String name, String type, String affiliation, int power, String effectId)
    {
        this.name = name;
        this.type = type;
        this.affiliation = affiliation;
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

    public String getType()
    {
        return type;
    }

    public String getEffectId()
    {
        return effectId;
    }
}
