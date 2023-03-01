package surveillance.observateur;

import surveillance.Evenement;
import surveillance.Observateur;

public class Log implements Observateur {
    private int NIVEAU_LOG;

    public Log(int NIVEAU_LOG) {
        this.NIVEAU_LOG = NIVEAU_LOG;
    }

    @Override
    public void alerter(Evenement evenement) {

    }
}
