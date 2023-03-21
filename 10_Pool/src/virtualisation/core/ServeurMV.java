package virtualisation.core;

import java.util.ArrayList;
import java.util.List;

// Coder methode de transfert


public abstract class ServeurMV {

    private final int MIN_POOL;
    private final int MAX_POOL;
    private final int MIN_LIBRE;
    private final int MAX_LIBRE;
    private final int INTERVALLE_DECONNEXION;
    private final int INCREMENT;
    private final int DELAI_RECUPERATION_SESSION;

    private boolean enExecution;

    private ArrayList<Session> sessions = new ArrayList<>();

    private SessionWrapper sessionsUtilisees;

    public ServeurMV() throws SessionException {

        this (3, 20, 2, 2, 5, 2000, 500);

    }

    public ServeurMV(int minPool, int maxPool, int increment, int minLibre, int maxLibre, int intervalleDeconnexion, int delaiRecuperationSession) throws SessionException {

        MIN_POOL = minPool;
        MAX_POOL = maxPool;
        INCREMENT = increment;
        MIN_LIBRE = minLibre;
        MAX_LIBRE = maxLibre;
        INTERVALLE_DECONNEXION = intervalleDeconnexion;
        DELAI_RECUPERATION_SESSION = delaiRecuperationSession;
    }

    public SessionWrapper connexion(String utilisateur)
    {
        this.sessions.connecter(utilisateur);
        return null;
    }

    public void demarrer()
    {

    }

    public void arreter()
    {

    }

    public boolean enExecution()
    {
        return false;
    }

    private void gererSessions()
    {

    }

    private SessionWrapper genererSessionWrapper(String utilisateur)
    {
        return null;
    }

    private void supprimerSessionNonUtilisees()
    {

    }

    private void supprimerSessionUtilisees()
    {

    }
    private Session recupererSession()
    {
        return null;
    }

    private void afficherSessions(String moment)
    {

    }

    protected abstract Session creerSession();


}
