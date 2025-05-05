package items.relics;

public abstract class relic
{
    private String name;
    private String description;
    private int rarity; // 0: common, 1: uncommon, 2: rare, 3: legendary

    public relic(String name, String description, int rarity) {
        this.name = name;
        this.description = description;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getRarity() {
        return rarity;
    }
}
