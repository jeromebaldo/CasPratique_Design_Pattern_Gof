package surveillance.observable;

import surveillance.Evenement;
import surveillance.Observable;
import surveillance.Observateur;

import java.util.ArrayList;
import java.util.List;

public class EspionEvenement implements Observable
{
    private List<Observateur> observateurs = new ArrayList<Observateur>();
    private static Observable observable;

    static {
        observable = new EspionEvenement();
    }

    private EspionEvenement()
    {
    }

    public void alerter(Evenement evenement)
    {
        for (Observateur obs : observateurs)
        {
            obs.alerter(evenement);
        }
    }

    @Override
    public void ajouterObservateur(Observateur observateur)
    {
        observateurs.add(observateur);
    }

    @Override
    public void supprimerObservateur(Observateur observateur)
    {
        observateurs.remove(observateur);
    }

    public static Observable getObservable() {
        return observable;
    }
}
