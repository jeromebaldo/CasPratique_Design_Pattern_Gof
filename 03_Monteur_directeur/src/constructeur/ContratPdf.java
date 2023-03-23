package constructeur;

public class ContratPdf extends Contrat{
    public void ajouteDocument(String document){ documents.add(document);}
    public void imprime()
    {
        this.documents.forEach(element -> System.out.println(element));
    }
}
