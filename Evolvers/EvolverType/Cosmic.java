package Evolvers.EvolverType;

/**
 * This is a type of Evolver that is based on cosmic entities for example Alien Monster.
 * 
 * The main characteristics of this Evolver type is that it can summon more tokens onto the board
 */
public interface Cosmic
{
    public static final String TYPE = "cosmic";

    void summonCosmicToken();
    void cosmicPowerBoost();
}