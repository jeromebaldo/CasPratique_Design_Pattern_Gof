package vehicule;

import vehicule.bombardier.avion.CRJ1000;
import vehicule.bombardier.avion.Global8000;
import vehicule.bombardier.motoneige.SkiDooExpeditionSport;
import vehicule.bombardier.motoneige.SkiDooRenegade;

import java.lang.reflect.InvocationTargetException;

public class FabriqueBombardier implements FabriqueVehicule
{

    @Override
    public Motoneige createMotoNeige(String modele) {

        Motoneige motoneige = null;
        switch(modele)
        {
            case("SkiDooExpeditionSport"):
                motoneige = new SkiDooExpeditionSport();
                break;
            case("SkiDooRenegade"):
                motoneige = new SkiDooRenegade();
            default:
                break;
        }

        return motoneige;
    }

    @Override
    public Avion createAvion(String modele) {

        Avion avion = null;
        switch(modele)
        {
            case("CRJ1000"):
                avion = new CRJ1000();
                break;
            case("Global8000"):
                avion = new Global8000();
                break;
            default:
                break;
        }

        return avion;
    }
}
