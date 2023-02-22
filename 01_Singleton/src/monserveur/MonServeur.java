package monserveur;

public class MonServeur
{
    private static MonServeur instance;
    private ServiceA serviceA;
    private ServiceB serviceB;
    public MonServeur() {
        this.serviceA = new ServiceA();
        this.serviceB = new ServiceB();
    }
    public static MonServeur getInstance() {
        if (instance == null)
        {
            instance = new MonServeur();
        }
        return instance;
    }

    public void publicPrint(String m){ System.out.println("publicPrint : "+ m);}

    void defaultPrint(String m){ System.out.println("defaultPrint : "+ m); }

    public ServiceAInterface GetServiceAInterface()
    {
        return this.serviceA;
    }

    public ServiceBInterface GetServiceBInterface()
    {
        return this.serviceB;
    }

    ServiceA getServiceA() {return serviceA;}
}
