package spawn.mortVivant;

import spawn.Monstre;
import spawn.orkoide.Ork;

public class Squelette extends Monstre
{
    private int nbrOs;

    public Squelette()
    {
        super("SQUELETTE");
        this.nbrOs = 1000;
    }

    protected final Squelette clone() throws CloneNotSupportedException {

        Squelette squelette= null;
        try {
            squelette = (Squelette) super.clone();
            squelette.nbrOs = this.nbrOs;
        }
        catch(CloneNotSupportedException cnse) {
            cnse.printStackTrace(System.err);
        }
        return squelette;
    }

    @Override
    public String toString() {
        return super.toString() + "{SQUELETTE{" +  nbrOs + "}}";
    }
}
