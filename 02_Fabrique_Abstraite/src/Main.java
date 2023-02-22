import vehicule.FabriqueAirBus;
import vehicule.FabriqueBombardier;
import vehicule.FabriqueVehicule;
import vehicule.Vehicule;
import vehicule.bombardier.motoneige.SkiDooExpeditionSport;
import vehicule.bombardier.motoneige.SkiDooRenegade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicule> mesVehicules = new ArrayList<>();
        FabriqueVehicule fabrique;

        fabrique = new FabriqueAirBus();
        mesVehicules.add(fabrique.createAvion("A380"));
        mesVehicules.add(fabrique.createAvion("A220_300"));

        fabrique = new FabriqueBombardier();
        mesVehicules.add(fabrique.createAvion("CRJ1000"));
        mesVehicules.add(fabrique.createAvion("Global8000"));
        mesVehicules.add(fabrique.createMotoNeige("SkiDooExpeditionSport"));
        mesVehicules.add(fabrique.createMotoNeige("SkiDooRenegade"));

        for(Vehicule vehicule: mesVehicules)
        {
            vehicule.AfficherCaracteristiques();
            vehicule.AfficherPublicite();
            System.out.println();
        }
    }
}