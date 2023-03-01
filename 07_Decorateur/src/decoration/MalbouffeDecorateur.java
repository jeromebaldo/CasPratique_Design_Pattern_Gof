package decoration;

public abstract class MalbouffeDecorateur
{
    private Malbouffe malbouffe;

    public MalbouffeDecorateur(Malbouffe malbouffe)
    {
        this.malbouffe = malbouffe;
    }

    public String getDescription()
    {
        return null;
    }
}
