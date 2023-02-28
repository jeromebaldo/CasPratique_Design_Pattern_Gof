package banque;

import java.util.HashMap;

public class Banque {
    private HashMap<Character, Question> questions = new HashMap<>();
    private static Banque banque = new Banque();

    public static Banque getInstance() {
        return banque;
    }

    private Banque() {
    }

    public Question getQuestion(char id) {
        if (questions.containsKey(id)) {
            return questions.get(id);
        } else {
            return chargerQuestion(id);
        }
    }

    private Question chargerQuestion(char id) {
        Question question = null;
        try {
            Class<?> classeQuestion = Class.forName("banque.Question" + id);
            question = (Question) classeQuestion.getDeclaredConstructor(String.class).newInstance("");
            questions.put(id, question);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return question;
    }
}

