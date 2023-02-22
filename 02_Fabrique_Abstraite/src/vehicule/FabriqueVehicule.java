package vehicule;

public interface FabriqueVehicule {

    public Motoneige createMotoNeige(String modele);
    public Avion createAvion(String modele);
}
