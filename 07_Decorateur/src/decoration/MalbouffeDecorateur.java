package decoration;

//seul méthode que j'ai trouvé pour faire coexister un objet malbouffe avec un décorateur
// j'aurai pu implementer pour chaque classe héritant du décorateur mais cela serait moins beau et moins pratique
// toutes nouvelles classes héritant de MalbouffeDecorateur aura automatiquement l'implementation Malbouffe
public abstract class MalbouffeDecorateur implements Malbouffe
{
    private Malbouffe malbouffe;

    public MalbouffeDecorateur(Malbouffe malbouffe)
    {
        this.malbouffe = malbouffe;
    }

    public String getDescription()
    {
        return this.malbouffe.getDescription();
    }
}