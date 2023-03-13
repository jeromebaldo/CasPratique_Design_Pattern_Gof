package spawn;

import spawn.mortVivant.SeigneurMortVivant;
import spawn.mortVivant.Squelette;
import spawn.mortVivant.Zombie;
import spawn.orkoide.Goblin;
import spawn.orkoide.Ork;

public class SpawnerMortVivant extends Spawner
{

    public SpawnerMortVivant() {}

    @Override
    protected void chargerMonstres()
    {
        ajouterMonstre(SeigneurMortVivant.class, new SeigneurMortVivant("les morts vivants", 5));
        ajouterMonstre(Squelette.class, new Squelette());
        ajouterMonstre(Zombie.class, new Zombie(true));
    }

    public Squelette spawnSquelette()
    {
        return (Squelette) spawnMonstre(Squelette.class);
    }

    public Zombie spawnZombie()
    {
        return (Zombie) spawnMonstre(Zombie.class);
    }

    public SeigneurMortVivant spawnSeigneurMortVivant()
    {
        return (SeigneurMortVivant) spawnMonstre(SeigneurMortVivant.class);
    }
}
