package vehicule.bombardier.motoneige;

import vehicule.Motoneige;

public class SkiDooRenegade extends Motoneige {
    public SkiDooRenegade() {
        super(137, 16704);
    }

    @Override
    public void AfficherPublicite() {
        System.out.println("SkiDooRenegade : Tu n'as pas de blonde? Achètes ton renegade alors!");
    }
}
