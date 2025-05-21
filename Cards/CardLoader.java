package Cards;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.util.*;

public class CardLoader
{
    public static List<Card> loadCardsFromJson(String filePath)
    {
        List<Card> cards = new ArrayList<>();

        try
        {
            Gson gson = new Gson();
            FileReader reader = new FileReader(filePath);
            JsonArray cardArray = JsonParser.parseReader(reader).getAsJsonArray();

            for (JsonElement element : cardArray)
            {
                JsonObject obj = element.getAsJsonObject();
                String type = obj.get("type").getAsString();

                if (type.equalsIgnoreCase("monster"))
                {
                    String name = obj.get("name").getAsString();
                    int health = obj.get("health").getAsInt();
                    int attack = obj.get("attack").getAsInt();
                    List<String> abilities = gson.fromJson(obj.get("abilities"), new TypeToken<List<String>>(){}.getType());

                    cards.add(new Monster(name, health, attack, abilities));
                } 
                else if (type.equalsIgnoreCase("spell"))
                {
                    String name = obj.get("name").getAsString();
                    int manaCost = obj.get("manaCost").getAsInt();
                    String effect = obj.get("effect").getAsString();

                    cards.add(new Spell(name, manaCost, effect));
                }
            }

            reader.close();

        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return cards;
    }
}