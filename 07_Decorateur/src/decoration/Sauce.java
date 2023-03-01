package decoration;

public class Sauce extends MalbouffeDecorateur implements Malbouffe
{

    public Sauce(Malbouffe malbouffe)
    {
       super(malbouffe);
    }

    public String getDescription()
    {
        return super.getDescription() + " avec de la sauce";
    }
}