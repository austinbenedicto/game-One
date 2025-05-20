package Evolvers.Natural;
import Evolvers.Evolver;

/**
 * This is a type of Evolver that is based on things found in nature for example Tree Monster.
 * 
 * The main charateristics of this Evolver type is that it has 4 lives instaed of 3 like the others
 */
public class Natural extends Evolver
{
    public Natural(String name, int maxLives, int strength, int defense)
    {
        super(name, maxLives, strength, defense);
    }

    // Override the evolve method to define how Natural evolves
    @Override
    protected void strengthenOnDeath()
    {
        // Example: Increase strength and defense on death
        this.strength += 5;
        this.defense += 3;
    }

    // Example: Override attack method for Natural
    @Override
    public int attack()
    {
        return super.attack() + 2; // Natural has a slight attack bonus
    }
}
