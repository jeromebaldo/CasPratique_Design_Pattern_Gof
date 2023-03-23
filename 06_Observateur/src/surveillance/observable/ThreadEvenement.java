package surveillance.observable;

import surveillance.Evenement;
import surveillance.Observateur;
import surveillance.observable.EspionEvenement;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadEvenement extends Thread
{
    private EspionEvenement espion;

    public ThreadEvenement(EspionEvenement espionEvenement)
    {
        this.espion = espionEvenement;
    }

    public void run()
    {
        ReentrantLock mutex = new ReentrantLock();//j'ai locké aussi le run()m
        mutex.lock();

        try
        {
            String[] descriptionsEvenement = new String[]{"Feu", "Fuite eau", "panne de courant", "Greve", "Bris majeur"};
            int niveau = (int) (Math.random()*100);
            int colonne = (int) (Math.random() * descriptionsEvenement.length);
            Evenement evenement =new Evenement(niveau, descriptionsEvenement[colonne]);
            //System.out.println(evenement.toString());//test des niveaux
            espion.alerter(evenement);
            try
            {
                Thread.sleep(1000); // attendre 1000 millisecondes avant de générer un nouvel événement
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        } finally
        {
            mutex.unlock();
        }



    }
}
