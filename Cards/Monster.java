package Cards;

public class Monster extends Card
{
    private boolean isAlive;

    public Monster(String name, int power, String effectId) 
    {
        super(name, power, effectId);
        isAlive = true;
    }

    public boolean isAlive()
    {
        return isAlive;
    }

    public void setAlive(boolean alive)
    {
        isAlive = alive;
    }

    public void setAlive(int enemyPower)
    {
        if(getPower() > enemyPower)
        {
            isAlive = true;
        }
        else
        {
            isAlive = false;
        }
    }

    public void setPower(int powerIncrease)
    {
        power = getPower() + powerIncrease;
    }
}
