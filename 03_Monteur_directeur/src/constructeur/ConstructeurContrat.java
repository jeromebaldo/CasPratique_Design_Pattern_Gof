package constructeur;

public abstract class ConstructeurContrat {

    protected Contrat contrat;

    public void construitBonDeCommande(String nomClient){}

    public void construitDemandeImmatriculation(String Demandeur){}

    public Contrat resultat(){ return contrat;}
}
