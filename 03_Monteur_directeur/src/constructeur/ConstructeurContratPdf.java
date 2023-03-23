package constructeur;

public class ConstructeurContratPdf extends ConstructeurContrat{

    public ConstructeurContratPdf()
    {
        this.contrat = new ContratPdf();
    }

    public void construitBonDeCommande(String nomClient)
    {
        this.contrat.ajouteDocument("<PDF>Bon de commande Client : " + nomClient + "</PDF>");
    }

    public void construitDemandeImmatriculation(String Demandeur)
    {
        this.contrat.ajouteDocument("<PDF>Demande d'immatriculation Demandeur : " + Demandeur + "</PDF>");
    }
}
