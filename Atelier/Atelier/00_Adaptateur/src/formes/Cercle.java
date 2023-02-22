package formes;

import transformation.Transformable;

public class Cercle extends Forme implements Transformable {

    private int rayon;

    public Cercle(int rayon) {
        super("CERCLE");
        this.rayon = rayon;
    }

    public Cercle() {
        super("CERCLE");
        rayon = 5;
    }

    @Override
    public double calculerVolumeTotal(){

        return Math.PI * Math.pow(rayon, 2);
    }

    @Override
    public double getDiametre() {
        return 2 * rayon;
    }

    @Override
    public double calculerPerte(int diametre) {
        return calculerVolumeTotal() - Math.PI * Math.pow(diametre/2, 2);
    }
}
