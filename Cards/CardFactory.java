package Cards;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Cards.Card;
import Cards.Monster;
import Cards.Spell;
import Cards.CardData;

public class CardFactory {
    private static final Map<String, Card> cardTemplates = new HashMap<>();

    // Called after loading with CardLoader
    public static void registerCards(List<Card> cards) {
        for (Card card : cards) {
            cardTemplates.put(card.getName(), card);
        }
    }

    // Use to create fresh copies of a card
    public static Card createCard(String name) {
        Card template = cardTemplates.get(name);
        if (template == null) return null;

        if (template instanceof Monster) {
            Monster m = (Monster) template;
            return new Monster(m.getName(), m.getPower(), m.getEffectId());
        } else if (template instanceof Spell) {
            Spell s = (Spell) template;
            return new Spell(s.getName(), s.getPower(), s.getEffectId());
        }

        return null;
    }
}