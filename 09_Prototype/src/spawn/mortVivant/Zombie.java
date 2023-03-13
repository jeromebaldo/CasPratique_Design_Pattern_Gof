package spawn.mortVivant;

import spawn.Monstre;
import spawn.orkoide.Goblin;

public class Zombie extends Monstre
{
    private boolean infectieux;

    public Zombie(boolean infectieux)
    {
        super("ZOMBIE");
        this.infectieux = infectieux;
    }


    protected final Zombie clone() throws CloneNotSupportedException {

        Zombie zombie = null;
        try {
            zombie = (Zombie) super.clone();
            zombie.infectieux = this.infectieux;
        }
        catch(CloneNotSupportedException cnse) {
            cnse.printStackTrace(System.err);
        }
        return zombie;
    }

    @Override
    public String toString() {
        return super.toString() + "{ZOMBIE{" + infectieux + "}}";
    }
}
