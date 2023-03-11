package controleur.commande;

import controleur.acteur.Acteur;

public class CommandeSaut implements Commande{
    @Override
    public void executer(Acteur acteur){acteur.sauter();}

    public String toString()
    {
        String intitule = "{SAUT}";
        return intitule;
    }
}
