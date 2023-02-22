package vehicule;

public abstract class Avion implements Vehicule {
    private int passagerMax;
    private double vitesseMaxCroisiere;
    private float distanceFranchissable;

    public Avion(int passagerMax, double vitesseMaxCroisiere, float distanceFranchissable) {
        this.passagerMax = passagerMax;
        this.vitesseMaxCroisiere = vitesseMaxCroisiere;
        this.distanceFranchissable = distanceFranchissable;
    }

    

    public void AfficherCaracteristiques()
    {
        //code pour récupérer le nom de l'objet et l'afficher
        // ce n'était pas obligatoire mais j'ai préféré afficher les noms pour plus de clareté
        //utilisation de getClass +getName puis de split/regex pour récupérer les noms des objets
        String nomObjet = this.getClass().getName();
        String[] partObjet = nomObjet.split("\\.");

        System.out.println("CARACTERISTIQUES DU PRODUIT : " + partObjet[3]);
        System.out.println("Passagers max : " + passagerMax);
        System.out.println("Distance franchissable : " + distanceFranchissable);
        System.out.println("Vitesse max en croisière : " + vitesseMaxCroisiere);
    }
}
