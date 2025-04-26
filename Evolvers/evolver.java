package Evolvers;

public abstract class evolver
{
    public int evoStatus;

    public int health;

    public int attackStatus;
    public int attackLevel;
    public int attackPower;

    public int magicStatus;
    public int magicLevel;
    public int magicPower;

    public int getEvoStatus()
    {
        return evoStatus;
    }
    public abstract void setEvoStatus(int evoStatus);

}
