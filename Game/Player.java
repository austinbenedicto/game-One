package Game;

public class Player
{
    private String name;
    private String choiceEvolver;
    private Deck deck;
    private int power;
    
    public Player(String name, String choiceEvolver)
    {
        this.name = name;
        this.choiceEvolver = choiceEvolver;
        power = 5;

        deck = new Deck(choiceEvolver);
    }

    public Deck getDeck()
    {
        return deck;
    }

    public String getName()
    {
        return name;
    }

    public String getChoiceEvolver()
    {
        return choiceEvolver;
    }

    public int getPower()
    {
        return power;
    }

    public void setPower(int power)
    {
        this.power = power;
    }
}
