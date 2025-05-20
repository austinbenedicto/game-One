package Cards;

public abstract class Spell extends Card
{
    private int power;
    private String effectId;
    
    public Spell(String name, int power, String effectId) 
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
