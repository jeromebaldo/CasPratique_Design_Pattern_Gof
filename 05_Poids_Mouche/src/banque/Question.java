package banque;

public abstract class Question {
    private String description;

    public Question(String description)
    {
        this.description = description;
    }

    protected String getDescription()
    {
        return this.description;
    }

    public String toString()
    {
        return this.description;
    }
}

