package surveillance.observable;

import surveillance.Evenement;

public class ThreadEvenement extends Thread
{
    private EspionEvenement espion;

    public ThreadEvenement(EspionEvenement espionEvenement)
    {
        this.espion = espionEvenement;
    }

    public void run()
    {
        String[] descriptionsEvenement = new String[]{"Feu", "Fuite eau", "panne de courant", "Greve", "Bris majeur"};
        int nbrThread = 25;
        int numThread = 0;
        while(numThread < nbrThread) {
            espion.alerter(new Evenement((int) (Math.random()*100), descriptionsEvenement[(int) (Math.random() * descriptionsEvenement.length)]));
            try {
                Thread.sleep(1000); // attendre 2 secondes avant de générer un nouvel événement
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            numThread++;
            System.out.println("numThread : "+ numThread);
        }
    }
}
