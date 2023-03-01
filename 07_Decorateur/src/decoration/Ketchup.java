package decoration;

public class Ketchup extends MalbouffeDecorateur implements Malbouffe{

    public Ketchup(Malbouffe malbouffe)
    {
        super(malbouffe);
    }

    public String getDescription()
    {
        return super.getDescription() + " avec ketchup";
    }
}