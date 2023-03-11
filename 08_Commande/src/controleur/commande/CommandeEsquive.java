package controleur.commande;

import controleur.acteur.Acteur;

public class CommandeEsquive implements Commande
{
    @Override
    public void executer(Acteur acteur){acteur.esquiver();}

    public String toString()
    {
        String intitule = "{ESQUIVE}";
        return intitule;
    }
}
