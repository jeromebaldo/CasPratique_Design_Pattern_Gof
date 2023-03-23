package etats;

public class EtatFermeture implements Etat{
    @Override
    public Etat envoyerCommande(int commande)
    {
        if(commande == 0)
        {
            return new EtatEteint();
        }
        return this; //si pas la commande adequate
    }

    @Override
    public void afficherInfo()
    {
        System.out.println("--------------------------");
        //System.out.println(" ETAT ACTUEL : ETEINT");//enonce de base
        //dans un soucie de clarté j'affiche l'etat fermeture et non eteint pour faire la distinction
        System.out.println(" ETAT ACTUEL : FERMETURE");
        System.out.println("--------------------------");
    }

    @Override
    public void afficherCommande()
    {
        //System.out.println("0 - Demarrer le PC"); // affichage de l'énoncé
        //je me suis permis de modifier l'entete. la fermeture a l'option d'éteindre le PC pas de le démarrer
        //c'est l'état etient qui peut seulement démarrer le PC
        System.out.println("    0 - Eteindre le PC");
    }
}
