import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SystemeExploitation se = new SystemeExploitation();
        int choix = 0;
        do
        {
            se.afficherInfo();
            se.afficherCommande();
            choix = getChoix(sc);
            se.envoyerCommande(choix);
        }
        while(choix != 9);
    }
    private static int getChoix(Scanner sc)
    {
        System.out.print("\nVotre choix (9 pour quitter): ");
        return sc.nextInt();
    }
}