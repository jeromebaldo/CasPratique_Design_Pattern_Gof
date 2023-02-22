package formes;

public class Carre extends Forme {

    private int taille;

    public Carre(int taille) {
        super("CARRE");
        this.taille = taille;
    }

    public int getTaille(){

        return taille;
    }

    @Override
    public double calculerVolumeTotal() {
        return taille * taille;
    }
}
