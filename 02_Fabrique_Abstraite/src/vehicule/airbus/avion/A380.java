package vehicule.airbus.avion;

import vehicule.Avion;

public class A380 extends Avion {


    public A380()
    {
        super(853, 15200, (float) 0.93);
    }

    /*
    A220_300 160 6112 0.82
    A380 853 15200 0.93
    CRJ1000 104 1650 0.835
    Global8000 17 7900 0.90*/
    @Override
    public void AfficherPublicite()
    {
        System.out.println("A380 : Fiable, populaire.Tout le contraire d'un Boeing.");
    }

}
