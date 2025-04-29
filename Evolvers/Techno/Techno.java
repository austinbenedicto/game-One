package Evolvers.Techno;
import Evolvers.Evolver;

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