package Evolvers.EvolverType;

public interface magic
{
    public static final String TYPE = "magic";

    /**
     * This method is used to cast a spell.
     * 
     * @param spellName The name of the spell to be cast.
     */
    void castSpell(String spellName);

    /**
     * This method is used to enchant a monster.
     * 
     * @param monsterName The name of the monster to be enchanted.
     */
    void enchantMonster(String monsterName);

    void magicPowerBoost();
    
}
