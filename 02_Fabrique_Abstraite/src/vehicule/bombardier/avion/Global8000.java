package vehicule.bombardier.avion;

import vehicule.Avion;

public class Global8000 extends Avion {

    public Global8000() {
        super(17, 7900, (float) 0.90);
    }

    @Override
    public void AfficherPublicite() {
        System.out.println("Global8000 : La ferrari des avions de ligne. Après le concorde bien sûr!");
    }
}
