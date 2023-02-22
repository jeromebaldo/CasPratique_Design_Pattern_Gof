package constructeur;

public class ConstructeurContratHtml extends ConstructeurContrat{

    public ConstructeurContratHtml(){}

    public void construitBonDeCommande(String nomClient)
    {
        ContratHtml contratHtml = new ContratHtml();
        contratHtml.ajouteDocument("<HTML>Bon de commande Client : " + nomClient + "</HTML>");
        this.contrat = contratHtml;
    }

    public void construitDemandeImmatriculation(String Demandeur)
    {
        ContratHtml contratHtml = new ContratHtml();
        contratHtml.ajouteDocument("<HTML>Demande d'immatriculation Demandeur : " + Demandeur + "</HTML>");
        this.contrat = contratHtml;
    }
}
