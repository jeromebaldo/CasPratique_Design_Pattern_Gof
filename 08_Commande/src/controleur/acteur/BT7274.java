package controleur.acteur;

public class BT7274 implements Acteur{
    @Override
    public void sauter()
    {
        System.out.println("BT7274-SAUTER");
    }

    @Override
    public void tirer()
    {
        System.out.println("BT7274-TIRER");
    }

    @Override
    public void esquiver()
    {
        System.out.println("BT7274-ESQUIVER");
    }

    @Override
    public void changerArme()
    {
        System.out.println("BT7274-CHANGER_ARME");
    }
}
