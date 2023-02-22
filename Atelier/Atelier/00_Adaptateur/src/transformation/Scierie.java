package transformation;

public class Scierie {

    private String proprietaire;
    private int diametreMinimum;

    public Scierie(String proprietaire, int diametreMinimum) {
        this.proprietaire = proprietaire;
        this.diametreMinimum = diametreMinimum;
    }

    public boolean validerTransformable(Transformable transformable){

        return transformable.getDiametre() > diametreMinimum;
    }

    public double calculerPerte(Transformable transformable){

        return transformable.calculerPerte(diametreMinimum);
    }

}
