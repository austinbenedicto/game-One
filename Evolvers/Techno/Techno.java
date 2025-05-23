package Evolvers.Techno;
import Evolvers.Evolver;

/**
 * This is a type of Evolver that is based on technology for example Robot Monster.
 * 
 * The main characteristics of this Evolver type is that it can summon more tokens onto the board
 */
public abstract class Techno extends Evolver
{
    public Techno(String name, int maxLives, int strength, int defense)
    {
        super(name, maxLives, strength, defense);
    }
   
    // Abstract method to be implemented by subclasses
    public abstract void evolve();

    // Method to get the name of the techno
    public String getName() {
        return this.getClass().getSimpleName();
    }

    // Method to get the description of the techno
    public String getDescription() {
        return "This is a techno class for evolution.";
    }
}