package divers;

import transformation.Transformable;

public class LivreAdaptateur implements Transformable {

    private LivreProgrammation livre;

    public LivreAdaptateur(LivreProgrammation livre) {
        this.livre = livre;
    }

    @Override
    public double getDiametre() {
        return 5;
    }

    @Override
    public double calculerPerte(int diametre) {
        return 0;
    }
}
