package vehicule;

public abstract class Motoneige implements Vehicule{

    private int longueurChenille;
    private int PDSF;

    public Motoneige(int longueurChenille, int PDSF)
    {
        this.longueurChenille = longueurChenille;
        this.PDSF = PDSF;
    }

    public void AfficherCaracteristiques()
    {
        //code pour récupérer le nom de l'objet et l'afficher
        //ce n'était pas obligatoire mais j'ai préféré afficher les noms pour plus de clareté
        //utilisation de getClass + getName puis de split/regex pour récupérer les noms des objets
        String nomObjet = this.getClass().getName();//permet de récupérer le nom de la classe
        String[] partObjet = nomObjet.split("\\.");

        System.out.println("CARACTERISTIQUES DU PRODUIT : " + partObjet[3]);
        System.out.println("Longueur de chenilles : " + longueurChenille);
        System.out.println("PDSF : " + PDSF);
    }
}
