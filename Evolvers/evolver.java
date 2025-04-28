package Evolvers;

public abstract class Evolver {
    protected String name;
    protected int maxLives;
    protected int currentLives;
    protected int strength;
    protected int defense;

    public Evolver(String name, int maxLives, int strength, int defense) {
        this.name = name;
        this.maxLives = maxLives;
        this.currentLives = maxLives;
        this.strength = strength;
        this.defense = defense;
    }

    // Called when the Evolver dies and returns stronger
    public void evolve() {
        if (currentLives > 0) {
            currentLives--;
            strengthenOnDeath();
        }
    }

    // Abstract method to define how each Evolver strengthens uniquely
    protected abstract void strengthenOnDeath();

    // Example: Attack action
    public int attack() {
        return strength;
    }

    // Example: Defend action
    public int defend() {
        return defense;
    }

    public boolean isAlive() {
        return currentLives > 0;
    }

    public String getName() {
        return name;
    }

    public int getCurrentLives() {
        return currentLives;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefense() {
        return defense;
    }
}

