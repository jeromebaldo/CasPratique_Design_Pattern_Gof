package controleur;

import controleur.acteur.Acteur;
import controleur.commande.*;

public class Controleur
{
    private Commande[][] commandes;
    private Acteur acteur;

    public Controleur(Acteur acteur)
    {
        this.acteur = acteur;
        this.commandes = new Commande[Bouton.values().length][];
        for (int i = 0; i < Bouton.values().length; i++)
        {
            this.commandes[i] = new Commande[1];
        }
        reinitialiserCommandes();
    }

    public void reinitialiserCommandes()
    {
        this.commandes[Bouton.X.ordinal()][0] = new CommandeSaut();
        this.commandes[Bouton.Y.ordinal()][0] = new CommandeTir();
        this.commandes[Bouton.A.ordinal()][0] = new CommandeEsquive();
        this.commandes[Bouton.B.ordinal()][0] = new CommandeChangementArme();
    }

    public void setCommande(Bouton bouton, Commande commande)
    {
        this.commandes[bouton.ordinal()][0] = commande;
    }

    public void setCommande(Bouton bouton)
    {
        this.commandes[bouton.ordinal()][0] = null;
    }

    public void jouer(Bouton bouton)
    {
       if(this.commandes[bouton.ordinal()][0] != null)
       {
           this.commandes[bouton.ordinal()][0].executer(this.acteur);
       }
    }

    public String toString()
    {
        String listCommande = "Controleur{\n";
        for(int i = 0; i < this.commandes.length; i++)
        {
            listCommande += "   ["+  Bouton.values()[i] + "] " + this.commandes[i][0] + "\n";
        }
        listCommande += "}";

        return listCommande;
    }

    public void setActeur(Acteur acteur)
    {
        this.acteur = acteur;
    }
}
