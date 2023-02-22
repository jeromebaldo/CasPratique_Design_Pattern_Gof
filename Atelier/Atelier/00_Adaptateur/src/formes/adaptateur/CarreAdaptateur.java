package formes.adaptateur;

import formes.Carre;
import transformation.Transformable;

public class CarreAdaptateur implements Transformable {

    private Carre carre;

    public CarreAdaptateur(Carre carre) {
        this.carre = carre;
    }


    @Override
    public double getDiametre() {
        return carre.getTaille();
    }

    @Override
    public double calculerPerte(int diametre) {
        return carre.calculerVolumeTotal() - Math.PI * Math.pow(diametre/2, 2);
    }
}
