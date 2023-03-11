package controleur.commande;

import controleur.acteur.Acteur;

public class CommandeChangementArme implements Commande
{
    @Override
    public void executer(Acteur acteur){acteur.changerArme();}

    public String toString()
    {
        String intitule = "{CHANGEMENT_ARME}";
        return intitule;
    }
}
