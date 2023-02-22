import divers.LivreAdaptateur;
import divers.LivreProgrammation;
import formes.Carre;
import formes.Cercle;
import formes.Forme;
import formes.adaptateur.CarreAdaptateur;
import transformation.Scierie;

public class Adaptateur {

    public static void main(String[] args) {

        Carre carre = new Carre(10);
        Cercle cercle = new Cercle(8);

        System.out.println("Les formes");
        Forme[] mesFormes = {cercle, carre};
        for (Forme f : mesFormes)
            System.out.println(f.getNom());

        Scierie scierie = new Scierie("ERIC", 5);

        System.out.println("Les pertes");

        CarreAdaptateur carreAdaptateur = new CarreAdaptateur(carre);
        LivreProgrammation livre = new LivreProgrammation();
        LivreAdaptateur livreAdaptateur = new LivreAdaptateur(livre);

        scierie.validerTransformable(carreAdaptateur);
        scierie.validerTransformable(cercle);
        scierie.validerTransformable(livreAdaptateur);

        System.out.println(scierie.calculerPerte(carreAdaptateur));
        System.out.println(scierie.calculerPerte(cercle));
        System.out.println(scierie.calculerPerte(livreAdaptateur));
    }
}
