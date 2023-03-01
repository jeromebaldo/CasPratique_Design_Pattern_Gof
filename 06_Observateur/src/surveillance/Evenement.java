package surveillance;

public class Evenement
{
    private int niveauUrgence;
    private String description;

    public Evenement(int niveauUrgence, String description) {
        this.niveauUrgence = niveauUrgence;
        this.description = description;
    }

    public String toString()
    {
        String etat = this.description +"\\" + Integer.toString(this.niveauUrgence) + "\\";
        return etat;
    }
}
