package character;

public class inventory {
    private final int SIZE = 4;

    public String [][] inventoryItems = new String[SIZE][SIZE];
    public String [] acessorySlots = new String[SIZE];
    public String [] weaponSlots = new String[SIZE];
    public String [] armorSlots = new String[SIZE];

    public inventory()
    {
        for(int i = 0; i < SIZE; i++)
        {
            for(int j = 0; j < SIZE; j++)
            {
                inventoryItems[i][j] = "Empty";
            }
        }
    }
}
