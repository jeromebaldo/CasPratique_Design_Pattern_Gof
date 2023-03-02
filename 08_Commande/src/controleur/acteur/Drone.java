package controleur.acteur;

public class Drone implements Acteur
{

    @Override
    public void sauter()
    {
        System.out.println("DRONE-SAUTER");
    }

    @Override
    public void tirer()
    {
        System.out.println("DRONE-TIRER");
    }

    @Override
    public void esquiver()
    {
        System.out.println("DRONE-ESQUIVER");
    }

    @Override
    public void changerArme()
    {
        System.out.println("DRONE-CHANGER_ARME");
    }
}
