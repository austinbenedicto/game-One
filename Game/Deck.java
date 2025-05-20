package Game;
import Cards.Card;
import Cards.Monster;
import Cards.Spell;

public class Deck
{
    private Spell[] spellDeck;
    private Monster[] monsterDeck;
    private String deckType;

    public Deck(String deckType)
    {
        this.deckType = deckType;

        spellDeck = new Spell[10];
        monsterDeck = new Monster[10];

        switch (deckType) {
            case "techno":
                techno();
                break;
            case "magic":
                magic();
                break;
            case "nature":
                nature();
                break;
            case "cosmic":
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
