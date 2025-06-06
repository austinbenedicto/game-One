package Evolvers;

public abstract class Evolver
{
    protected String name;
    protected int maxLives;
    protected int currentLives;

    public Evolver(String name, int maxLives)
    {
        this.name = name;
        this.maxLives = maxLives;
        this.currentLives = maxLives;
    }

    // Called when the Evolver dies and returns stronger
    public void evolve() {
        if (currentLives > 0)
        {
            currentLives--;
            strengthenOnDeath();
        }
    }

    // Abstract method to define how each Evolver strengthens uniquely
    protected abstract void strengthenOnDeath();

    public boolean isAlive() {
        return currentLives > 0;
    }

    public String getName() {
        return name;
    }

    public int getCurrentLives() {
        return currentLives;
    }
}

