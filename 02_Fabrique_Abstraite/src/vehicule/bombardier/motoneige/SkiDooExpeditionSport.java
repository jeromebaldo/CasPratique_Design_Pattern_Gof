package vehicule.bombardier.motoneige;

import vehicule.Motoneige;

public class SkiDooExpeditionSport extends Motoneige {
    public SkiDooExpeditionSport() {
        super(154, 10654);
    }

    @Override
    public void AfficherPublicite()
    {
        System.out.println("SkiDooExpeditionSport : Modèle idéal pour se perdre dans les forêts du québec. En cadeau, demandes ta boussole et ta carte!");
    }
}
