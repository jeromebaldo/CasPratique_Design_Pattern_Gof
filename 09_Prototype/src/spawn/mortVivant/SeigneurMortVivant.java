package spawn.mortVivant;

import spawn.Monstre;

public class SeigneurMortVivant extends Monstre
{
    private int nbrSort;
    private String nomFaction;

    public SeigneurMortVivant(String nomFaction, int nbrSort)
    {
        super("SEIGNEUR_MORT_VIVANT");
        this.nomFaction = nomFaction;
        this.nbrSort = nbrSort;
    }

    protected final SeigneurMortVivant clone() throws CloneNotSupportedException {

        SeigneurMortVivant seigneurMortVivant= null;
        try
        {
            seigneurMortVivant = (SeigneurMortVivant) super.clone();
            seigneurMortVivant.nomFaction = this.nomFaction;
            seigneurMortVivant.nbrSort = this.nbrSort;
        }
        catch(CloneNotSupportedException cnse)
        {
            cnse.printStackTrace(System.err);
        }
        return seigneurMortVivant;
    }

    @Override
    public String toString() {
        return super.toString() + "{SEIGNEUR_MORT_VIVANT{" + "nombre de sorts : " +  nbrSort + "| nom faction : " + nomFaction + "}}";
    }
}
