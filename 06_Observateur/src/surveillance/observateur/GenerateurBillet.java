package surveillance.observateur;

import surveillance.Evenement;
import surveillance.Observateur;
import surveillance.observable.EspionEvenement;

public class GenerateurBillet implements Observateur
{
    public GenerateurBillet()
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
            if(etat.charAt(i) == '\\') {
                infoEven[j] = membre;
                membre = "";
                j++;
            } else {
                membre += etat.charAt(i);
            }
        }
        if(infoEven[0].equals("Bris majeur"))
        {
            System.out.println("OUVERTURE D'UN BILLET: Evenement{niveauUrgence="
            +infoEven[1] + ", description='" + infoEven[0] + "'}");
        }
    }
}
