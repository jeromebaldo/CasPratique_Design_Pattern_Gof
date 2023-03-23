import banque.Evaluation;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main
{
    public static void main(String[] args)
    {
        final int NB_ETUDIANTS = 149;
        ArrayList<Evaluation> mesEvaluationsAndroid = new ArrayList<Evaluation>();

        // creation des evaluations
        for(int x = 1; x <= NB_ETUDIANTS; x++)
        {
            mesEvaluationsAndroid.add(new Evaluation(x, genererIdQuestion(), genererIdQuestion()));
        }

        // Affichage des évaluations
        for(Evaluation evaluation : mesEvaluationsAndroid)
        {
            System.out.println(evaluation);
        }
    }
    private static char genererIdQuestion()
    {
        return (char) (ThreadLocalRandom.current().nextInt(65, 68));
    }
}