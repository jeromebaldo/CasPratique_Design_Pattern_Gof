package vehicule;

import vehicule.Avion;
import vehicule.FabriqueVehicule;
import vehicule.Motoneige;
import vehicule.airbus.avion.A220_300;
import vehicule.airbus.avion.A380;

public class FabriqueAirBus implements FabriqueVehicule
{

    @Override
    public Motoneige createMotoNeige(String modele)
    {
        return null;
    }

    @Override
    public Avion createAvion(String modele)
    {
        //tu as autorisé à mettre du switch
        Avion avion = null;
        switch(modele)
        {
            case("A380"):
                avion = new A380();
                break;
            case("A220_300"):
                avion = new A220_300();
                break;
            default:
                break;
        }

        return avion;
    }
}
