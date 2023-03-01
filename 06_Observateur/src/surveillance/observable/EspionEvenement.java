package surveillance.observable;

import surveillance.Evenement;
import surveillance.Observable;
import surveillance.Observateur;

public class EspionEvenement implements Observable
{
    private Observateur observateurs;
    private static Observable observable;

    private EspionEvenement() {
    }

    public void alerter(Evenement evenement){}

    @Override
    public void ajouterObservateur(Observateur observateur) {

    }

    @Override
    public void supprimerObservateur(Observateur observateur) {

    }
}
