package surveillance;

public class Evenement
{
    private int niveauUrgence;
    private String description;
    public Evenement(int niveauUrgence, String description)
    {
        this.niveauUrgence = niveauUrgence;
        this.description = description;
    }
    public String toString()
    {
        // les "\\" permettent de séparer mes champs quand la méthode est appelé dans les alertes des observateurs
        //pour chaque alerter les \\ permettent de séparer le niveau et la desription
        //utiliser en laboratoire de réseau . simple mais pas forcement le plus optimal
        String etat = this.description + "\\" + Integer.toString(this.niveauUrgence) + "\\";
        return etat;
    }
}
