import Cards.Card;

public class Deck
{
    private Card[] spellDeck = new Card[52];
    private Card[] monsterDeck = new Card[52];

    public Deck()
    {
        spellDeck = new Card[52];
        monsterDeck = new Card[52];

        for (int i = 0; i < 52; i++)
        {
           // spellDeck[i] = new Card();
            //monsterDeck[i] = new Card();
        }
    }
}
