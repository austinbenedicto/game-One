package Evolvers.EvolverType;

/**
 * This is a type of Evolver that is based on things found in nature for example Tree Monster.
 * 
 * The main charateristics of this Evolver type is that it has 4 lives instaed of 3 like the others
 */
public interface Natural 
{
    public static final String TYPE = "natural";

    void photosynthesis();

    void naturalHealing();
    void naturalPowerBoost();
}

