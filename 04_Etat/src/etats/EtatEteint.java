package etats;

public class EtatEteint implements Etat{
    @Override
    public Etat envoyerCommande(int commande)
    {
        return null;
    }

    @Override
    public void afficherInfo()
    {

    }

    @Override
    public void afficherCommande()
    {

    }
}
