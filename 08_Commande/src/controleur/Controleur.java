package controleur;

import controleur.acteur.Acteur;
import controleur.commande.Commande;

public class Controleur
{
    private Commande[] commandes;
    private Acteur acteur;

    public Controleur(Acteur acteur)
    {
        this.acteur = acteur;
    }

    public void reinitialiserCommandes(){}

    public void setCommande(Bouton bouton, Commande commande){}

    public void setCommande(Bouton bouton){}

    public void jouer(Bouton bouton){}

    public String toString()
    {
        return null;
    }
}
