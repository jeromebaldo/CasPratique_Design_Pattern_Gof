package surveillance.observateur;

import surveillance.Evenement;
import surveillance.Observateur;
import surveillance.observable.EspionEvenement;

import java.util.concurrent.locks.ReentrantLock;

public class Log implements Observateur {
    private int NIVEAU_LOG;

    public Log(int NIVEAU_LOG)
    {
        this.NIVEAU_LOG = NIVEAU_LOG;
        EspionEvenement.getObservable().ajouterObservateur(this);
    }

    @Override
    public void alerter(Evenement evenement)
    {
        ReentrantLock mutex = new ReentrantLock();
        mutex.lock();

        try {
            String etat = evenement.toString();
            String[] infoEven = new String[2];
            String membre = "";
            int j = 0;
            for(int i = 0; i < etat.length(); i++)
            {
                if(etat.charAt(i) == '\\') {
                    infoEven[j] = membre;
                    membre = "";
                    j++;
                } else {
                    membre += etat.charAt(i);
                }
            }
            int valeur = Integer.parseInt(infoEven[1]);
            if(valeur > this.NIVEAU_LOG)
            {
                System.out.println("LOG : Evenement{niveauUrgence="
                        +infoEven[1] + ", description='" + infoEven[0] + "'}");
            }
        } finally {
            mutex.unlock();
        }



    }
}
