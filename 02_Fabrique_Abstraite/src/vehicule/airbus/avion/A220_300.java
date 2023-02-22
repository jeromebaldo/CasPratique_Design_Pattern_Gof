package vehicule.airbus.avion;

import vehicule.Avion;

public class A220_300 extends Avion {

    public A220_300()
    {
        super(160, 6112, (float)0.82);
    }
    /*
    A220_300 160 6112 0.82
    A380 853 15200 0.93
    CRJ1000 104 1650 0.835
    Global8000 17 7900 0.90*/
    @Override
    public void AfficherPublicite() {
        System.out.println("A200_300 : Comme ma grand-mère. Vieux, Immortel et Infatigable");
    }
}
