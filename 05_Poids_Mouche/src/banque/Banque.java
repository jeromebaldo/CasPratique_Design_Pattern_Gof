package banque;

import java.util.HashMap;

public class Banque
{
    private HashMap questions;
    private static Banque banque = new Banque();

    public static Banque getInstance()
    {
        return null;
    }

    private Banque()
    {
    }

    private Question getQuestion(char id)
    {
        return null;
    }

    private Question chargerQuestion(char id)
    {
        Question question = null;
        try
        {
            Class<Question> classeQuestion = (Class<Question>) Class.forName("banque.Question" + id);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return question;
    }
}
