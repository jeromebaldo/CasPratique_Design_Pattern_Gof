package controleur;

import controleur.acteur.Acteur;
import controleur.commande.*;

//lien qui m'a servi pour gérer l'énumération de bouton
//https://fr.wikibooks.org/wiki/Programmation_Java/%C3%89num%C3%A9rations#M%C3%A9thodes_utiles

public class Controleur
{
    private Commande[] commandes;
    private Acteur acteur;

    public Controleur(Acteur acteur)
    {
        this.acteur = acteur;
        this.commandes = new Commande[Bouton.values().length];//tableau de la longueur totale de l'énumération
        /*for (int i = 0; i < Bouton.values().length; i++)
        {
            this.commandes[i] = new Commande[1];//créer un tableau de taille 1 pour accueillir une seule commande
        }*/
        reinitialiserCommandes();
    }

    public void reinitialiserCommandes()
    {
        this.commandes[Bouton.X.ordinal()] = new CommandeSaut();
        this.commandes[Bouton.Y.ordinal()] = new CommandeTir();
        this.commandes[Bouton.A.ordinal()] = new CommandeEsquive();
        this.commandes[Bouton.B.ordinal()] = new CommandeChangementArme();
    }
    public void setCommande(Bouton bouton, Commande commande)
    {
        this.commandes[bouton.ordinal()] = commande;
    }
    public void setCommande(Bouton bouton)
    {
        this.commandes[bouton.ordinal()] = null;
    }
    public void jouer(Bouton bouton)
    {
       if(this.commandes[bouton.ordinal()] != null)
       {
           this.commandes[bouton.ordinal()].executer(this.acteur);
       }
    }
    public String toString()
    {
        String listCommande = "Controleur{\n";
        for(int i = 0; i < this.commandes.length; i++)
        {
            listCommande += "   ["+  Bouton.values()[i] + "] " + this.commandes[i] + "\n";// afficher le bouton ainsi que la commande
        }
        listCommande += "}";

        return listCommande;
    }
    public void setActeur(Acteur acteur)
    {
        this.acteur = acteur;
    }//méthode rajouté
}
