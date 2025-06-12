package Cards.Effects;

public class TokenSummon implements Effect
{
    private String tokenName;
    private int tokenPower;

    public TokenSummon(String tokenName, int tokenPower)
    {
        this.tokenName = tokenName;
        this.tokenPower = tokenPower;
    }

    @Override
    public void apply(Game.Board board, Cards.Card owner)
    {
        Cards.Monster token = new Cards.Monster(tokenName, tokenPower, "Nothing");
    }
    
}
