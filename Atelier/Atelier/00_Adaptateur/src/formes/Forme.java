package formes;

public abstract class Forme {

    private String nom;

    public Forme(String nom) {              // Constructeur
        this.nom = nom;
    }

    public String getNom() {                // getter
        return nom;
    }

     public abstract double calculerVolumeTotal();
}