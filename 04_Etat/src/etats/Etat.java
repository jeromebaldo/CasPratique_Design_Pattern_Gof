package etats;

public interface Etat
{
    public Etat envoyerCommande(int commande);
    public void afficherInfo();
    public void afficherCommande();
}
