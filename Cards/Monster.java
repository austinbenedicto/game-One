package Cards;

public abstract class Monster extends Card
{
    private int power;
    private String effectId;

    public Monster(String name, int power, String effectId) 
    {
        super(name);
        this.power = power;
        this.effectId = effectId;
    }

    public int getPower() 
    {
        return power;
    }

    public String getEffectId() 
    {
        return effectId;
    }
}
