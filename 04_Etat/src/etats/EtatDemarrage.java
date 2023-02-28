package etats;

public class EtatDemarrage implements Etat{
    @Override
    public Etat envoyerCommande(int commande)
    {
        if(commande == 0)
        {
            return new EtatEteint();
        }
        else if (commande == 1)
        {
            return new EtatAuthentification();
        }

        return this;
    }

    @Override
    public void afficherInfo()
    {
        System.out.println("--------------------------");
        System.out.println(" ETAT ACTUEL : DEMARRAGE");
        System.out.println("--------------------------");
    }

    @Override
    public void afficherCommande()
    {
        System.out.println("    0 - Eteindre le PC");
        System.out.println("    1 - CTRL+ALT+SUPPR");
    }
}
