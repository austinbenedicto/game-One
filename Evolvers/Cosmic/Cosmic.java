package Evolvers.Cosmic;
import Evolvers.Evolver;

/**
 * This is a type of Evolver that is based on cosmic entities for example Alien Monster.
 * 
 * The main characteristics of this Evolver type is that it can self desturct to 
 */
public abstract class Cosmic extends Evolver
{
    public Cosmic(String name, int maxLives, int strength, int defense)
    {
        super(name, maxLives, strength, defense);
    }
    
    // Abstract method to be implemented by subclasses
    public abstract void evolve();

    // Method to get the name of the cosmic
    public String getName() {
        return this.getClass().getSimpleName();
    }

    // Method to get the description of the cosmic
    public String getDescription() {
        return "This is a cosmic class for evolution.";
    }
}