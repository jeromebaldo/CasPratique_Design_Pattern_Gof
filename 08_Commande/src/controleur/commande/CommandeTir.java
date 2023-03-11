package controleur.commande;

import controleur.acteur.Acteur;

public class CommandeTir implements Commande
{

    @Override
    public void executer(Acteur acteur){acteur.tirer();}

    public String toString()
    {
        String intitule = "{TIR}";
        return intitule;
    }
}
