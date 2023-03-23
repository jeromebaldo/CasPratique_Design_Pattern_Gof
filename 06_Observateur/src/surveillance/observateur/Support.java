package surveillance.observateur;

import surveillance.Evenement;
import surveillance.Observateur;
import surveillance.observable.EspionEvenement;

import java.util.concurrent.locks.ReentrantLock;

public class Support implements Observateur {

    public Support()
    {
        EspionEvenement.getObservable().ajouterObservateur(this);
    }

    @Override
    public void alerter(Evenement evenement)
    {
        ReentrantLock mutex = new ReentrantLock();
        mutex.lock();

        try
        {
            String etat = evenement.toString();
            String[] infoEven = new String[2];
            String membre = "";
            int j = 0;
            for(int i = 0; i < etat.length(); i++)
            {
                if(etat.charAt(i) == '\\')
                {
                    infoEven[j] = membre;
                    membre = "";
                    j++;
                }
                else
                {
                    membre += etat.charAt(i);
                }
            }
            int valeur = Integer.parseInt(infoEven[1]);
            if(valeur > 90)//verification si supérieur à 90
            {
                System.out.println("SUPPORT URGENCE : Evenement{niveauUrgence="
                        +infoEven[1] + ", description='" + infoEven[0] + "'}");
            }
        }
        finally
        {
            mutex.unlock();
        }


    }
}
