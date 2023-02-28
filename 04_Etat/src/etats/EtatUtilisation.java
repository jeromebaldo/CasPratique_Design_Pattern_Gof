package etats;

public class EtatUtilisation implements Etat{
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
        else if (commande == 2)
        {
            return new EtatFermeture();
        }
        return this;
    }

    @Override
    public void afficherInfo()
    {
        System.out.println("--------------------------");
        System.out.println(" ETAT ACTUEL : UTILISATION");
        System.out.println("--------------------------");
    }

    @Override
    public void afficherCommande()
    {
        System.out.println("    0 - Eteindre le PC");
        System.out.println("    1 - Fermer la session");
        System.out.println("    2 - Fermer le PC");
    }
}
