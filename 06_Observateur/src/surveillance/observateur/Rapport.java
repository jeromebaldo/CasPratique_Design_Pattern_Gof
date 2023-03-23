package surveillance.observateur;

import surveillance.Evenement;
import surveillance.Observateur;
import surveillance.observable.EspionEvenement;

import java.util.concurrent.locks.ReentrantLock;

public class Rapport implements Observateur {

    public Rapport()
    {
        EspionEvenement.getObservable().ajouterObservateur(this);
    }

    @Override
    public void alerter(Evenement evenement)
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
                membre += etat.charAt(i);//concatene
            }
        }
        System.out.println("RAPPORT : " + infoEven[0]);
    }
}
