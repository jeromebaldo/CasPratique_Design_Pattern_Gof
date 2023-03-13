import spawn.*;
import spawn.mortVivant.SeigneurMortVivant;
import spawn.mortVivant.Squelette;
import spawn.mortVivant.Zombie;
import spawn.orkoide.Goblin;
import spawn.orkoide.Ork;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]){

        genereTribut();
        genereTributClone();
        genereHorde();
        genereHordeClone();
    }
    private static void genereHorde()
    {
        List<Monstre> horde = new ArrayList<Monstre>();
        for (int x = 0; x < 3; x++)
            horde.add(new Squelette());
        for (int x = 0; x < 3; x++)
            horde.add(new Zombie(false));
        for(int x = 0; x < 3; x++)
        {
            horde.add(new SeigneurMortVivant("les liches", 5));
        }
        for(Monstre mortVivant : horde)
            System.out.println(mortVivant);

    }

    private static void genereHordeClone()
    {
        SpawnerMortVivant spawner = new SpawnerMortVivant();
        List<Monstre> horde = new ArrayList<Monstre>();

        for (int x = 0; x < 1000; x++)
            horde.add(spawner.spawnSquelette());
        for (int x = 0; x < 5000; x++)
            horde.add(spawner.spawnZombie());
        for (int x = 0; x < 500; x++)
            horde.add(spawner.spawnSeigneurMortVivant());
        for(Monstre mortVivant : horde)
            System.out.println(mortVivant);
    }

    private static void genereTribut() {

        List<Monstre> tribut = new ArrayList<Monstre>();

        for (int x = 0; x < 5; x++)
            tribut.add(new Ork());
        for (int x = 0; x < 3; x++)
            tribut.add(new Goblin("Evil Sunz"));

        for(Monstre orkoide : tribut)
            System.out.println(orkoide);
    }

    private static void genereTributClone() {

        SpawnerOrkoide spawner = new SpawnerOrkoide();
        List<Monstre> tribut = new ArrayList<Monstre>();

        Ork ork = spawner.spawnOrk();
        System.out.println(ork.getClass());
        System.out.println(ork);

        for (int x = 0; x < 1000; x++)
            tribut.add(spawner.spawnOrk());
        for (int x = 0; x < 5000; x++)
            tribut.add(spawner.spawnGoblin());

        for(Monstre orkoide : tribut)
            System.out.println(orkoide);
    }
}
