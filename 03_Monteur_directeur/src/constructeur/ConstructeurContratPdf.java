package constructeur;

public class ConstructeurContratPdf extends ConstructeurContrat{
    public ConstructeurContratPdf(){}

    public void construitBonDeCommande(String nomClient)
    {
        ContratPdf contratPdf = new ContratPdf();
        contratPdf.ajouteDocument("<PDF>Bon de commande Client : " + nomClient + "</PDF>");
        this.contrat = contratPdf;
    }

    public void construitDemandeImmatriculation(String Demandeur)
    {
        ContratPdf contratPdf = new ContratPdf();
        contratPdf.ajouteDocument("<PDF>Demande d'immatriculation Demandeur : " + Demandeur + "</PDF>");
        this.contrat = contratPdf;
    }
}
