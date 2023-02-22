package constructeur;

public class ContratHtml extends Contrat{

    public void ajouteDocument(String document){documents.add(document);}
    public void imprime()
    {
        this.documents.forEach(element -> System.out.println(element));
    }
}
