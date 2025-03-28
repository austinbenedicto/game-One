package character;

import java.util.Scanner;

/**
 * This is the player class. It will be used to create the player object.
 * The player object will be used to store the player's information.
 */
public class player {
    Scanner in = new Scanner(System.in); 

    private String name;
    private int health;
    private int attack;
    private int defense;
    private int speed;
    
    /**
     * This is the constructor for the player class.
     */
    public player()
    {
        name = in.nextLine();
        health = 100;
        attack = 10;
        defense = 10;
        speed = 10;
    }

    /**
     * This method will be used to get the player's name.
     * @return the player's name
     */
    public String getName()
    {
        return name;
    }

    /**
     * This method will be used to get the player's health.
     * @return the players health
     */
    public int getHealth()
    {
        return health;
    }

    /**
     * This method will be used to get the player's attack.
     * @return the players attack
     */
    public int getAttack()
    {
        return attack;
    }

    /**
     * This method will be used to get the player's defense.
     * @return the players defense
     */
    public int getDefense()
    {
        return defense;
    }

    /**
     * This method will be used to get the player's speed.
     * @return the players speed
     */
    public int getSpeed()
    {
        return speed;
    }

    /**
     * This method will be used to set the player's health.
     * 
     * @param health the health the player will lose
     */
    public void setHealth(int health)
    {
        this.health -= health;
    }

    /**
     * This method will be used to set the player's attack.
     * 
     * @param attack the attack the player will gain
     */
    public void setAttack(int attack)
    {
        this.attack += attack;
    }

    /**
     * This method will be used to set the player's defense.
     * 
     * @param defense the defense the player will gain
     */
    public void setDefense(int defense)
    {
        this.defense += defense;
    }
}
