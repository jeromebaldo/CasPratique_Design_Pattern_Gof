package monserveur;

public class ServiceB extends Service implements ServiceBInterface {

    public ServiceB(){
        super();
    }
    public void methodeC(){MonServeur.getInstance().defaultPrint("C");}
    public void methodeD(){MonServeur.getInstance().publicPrint("D");}
    public void methodeE(){MonServeur.getInstance().GetServiceAInterface().methodeA();}
    public void methodeF(){MonServeur.getInstance().getServiceA().methodeB();}
}
