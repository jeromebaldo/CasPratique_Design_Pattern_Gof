package etats;

public class EtatEteint implements Etat{
    @Override
    public Etat envoyerCommande(int commande)
    {
        if(commande == 0)
        {
            return new EtatDemarrage();
        }
        return this;
    }

    @Override
    public void afficherInfo()
    {
        System.out.println("--------------------------");
        System.out.println(" ETAT ACTUEL : ETEINT");
        System.out.println("--------------------------");
    }

    @Override
    public void afficherCommande()
    {
        System.out.println("    0 - Demarrer le PC");
    }
}
