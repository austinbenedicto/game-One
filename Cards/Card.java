package Cards;

public abstract class Card 
{
    private String name;
    private int power;
    private String effectId;

    public Card(String name, int power, String effectId) 
    {
        this.name = name;
        this.power = power;
        this.effectId = effectId;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public String getEffectId() {
        return effectId;
    }

    public void setPower(int powerIncrease)
    {
        power = getPower() + powerIncrease;
    }
}
