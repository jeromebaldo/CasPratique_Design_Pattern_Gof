package banque;

import banque.Question;

public class Evaluation {
    private int noEvaluation;
    private Question q1;
    private Question q2;

    public Evaluation(int noEvaluation, char q1, char q2) {
        this.noEvaluation = noEvaluation;
        this.q1 = Banque.getInstance().getQuestion(q1);
        this.q2 = Banque.getInstance().getQuestion(q2);
    }

    public String toString() {
        return "Evaluation #" + noEvaluation + ":\n" + "q1: Question{" + q1.getDescription() + "}\nq2: Question{" + q2.getDescription() + "}";
    }
}
