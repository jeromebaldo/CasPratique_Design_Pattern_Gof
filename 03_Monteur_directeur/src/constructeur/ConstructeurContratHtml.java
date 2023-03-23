package constructeur;

public class ConstructeurContratHtml extends ConstructeurContrat{

    public ConstructeurContratHtml(){this.contrat = new ContratHtml();}

    public void construitBonDeCommande(String nomClient)
    {
        this.contrat.ajouteDocument("<HTML>Bon de commande Client : " + nomClient + "</HTML>");
    }

    public void construitDemandeImmatriculation(String Demandeur)
    {
        this.contrat.ajouteDocument("<HTML>Demande d'immatriculation Demandeur : " + Demandeur + "</HTML>");
    }
}
