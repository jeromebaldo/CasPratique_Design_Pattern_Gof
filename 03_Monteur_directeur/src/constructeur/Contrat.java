package constructeur;

import java.util.ArrayList;
import java.util.List;

public abstract class Contrat {

    protected List<String> documents;

    public Contrat() {
        this.documents = new ArrayList<String>();
    }

    public void ajouteDocument(String document){}
    public void imprime(){ }
}
