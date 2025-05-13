package Game;
import Cards.Card;
import Cards.Monster;
import Cards.Spell;

public class Deck
{
    private Spell[] spellDeck;
    private Monster[] monsterDeck;
    private int deckType;

    public Deck(int deckType)
    {
        this.deckType = deckType;

        spellDeck = new Spell[10];
        monsterDeck = new Monster[10];

        switch (deckType) {
            case 1:
                techno();
                break;
            case 2:
                magic();
                break;
            case 3:
                nature();
                break;
            case 4:
                cosmic();
                break;
            default:
                System.out.println("Invalid deck type. Please choose a valid type (1-4).");
        }
    }

    private Card[] techno()
    {
        return null;
    }

    private Card[] magic()
    {
        return null;
    }

    private Card[] nature()
    {
        return null;
    }

    private Card[] cosmic()
    {
        return null;
    }

}
