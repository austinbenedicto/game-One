package Evolvers.EvolverType;

/**
 * This is a type of Evolver that is based on technology for example Robot Monster.
 * 
 * The main characteristics of this Evolver type is that it can get more power to use mroe cards
 */
public interface Techno
{
    public static final String TYPE = "techno";

    void energyBoost();
    void recharge();
    void technoPowerBoost();
}