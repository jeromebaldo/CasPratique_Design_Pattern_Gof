package surveillance.observable;

import surveillance.Evenement;
import surveillance.Observable;
import surveillance.Observateur;
import surveillance.observable.ThreadEvenement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

//lien sympa pour éviter la situation de concurrence pour les threads
//https://devstory.net/13641/java-copyonwritearraylist
// lien pour le mutex en java
//https://www.geeksforgeeks.org/reentrant-lock-java/

public class EspionEvenement implements Observable {
    private List<Observateur> observateurs = new CopyOnWriteArrayList<>();
    private static Observable observable;
    private ReentrantLock mutex = new ReentrantLock(); //entorse à ton énoncé mais je n'ai trouvé que cette méthode pour  organiser les alertes par threads
    //le mettre en attribut plutot que localement permet de simplifier l'accès à la méthode alerter
    static
    {
        observable = new EspionEvenement();
    }

    public EspionEvenement()
    {
        int nbrThread = 10;// génération de 10 threads
        for (int i = 0; i < nbrThread; i++)
        {
            ThreadEvenement threadEvenement = new ThreadEvenement(this);
            threadEvenement.start();
        }//ce n'est pas bien car je ne cloture pas correctement les threads mais cela marche
    }

    public void alerter(Evenement evenement)
    {
        mutex.lock();

        try
        {
            for (Observateur obs : observateurs)
            {
                obs.alerter(evenement);
            }
        }
        finally
        {
            mutex.unlock();
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

    public static Observable getObservable()
    {
        return observable;
    }
}
