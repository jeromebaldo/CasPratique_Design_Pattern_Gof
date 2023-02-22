package vehicule.bombardier.avion;

import vehicule.Avion;

public class CRJ1000 extends Avion {
    public CRJ1000()
    {
        super(104, 1650, (float)0.835);
    }

    @Override
    public void AfficherPublicite() {
        System.out.println("CRJ1000 : vive le grand luxe!");
    }
}
