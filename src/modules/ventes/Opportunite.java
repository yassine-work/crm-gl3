package modules.ventes;

import core.IObservateur;
import java.util.ArrayList;
import java.util.List;

class Opportunite {
    private String nom;
    private double montant;
    private IEtatOpportunite etat;
    private List<IObservateur> observateurs = new ArrayList<>();

    public Opportunite(String nom, double montant) {
        this.nom = nom;
        this.montant = montant;
        this.etat = new EtatOuvert();
    }

    public void attacher(IObservateur o) { observateurs.add(o); }

    public void notifier(String msg) {
        for (IObservateur o : observateurs) o.mettreAJour(msg);
    }

    public void setEtat(IEtatOpportunite nouvelEtat) {
        this.etat = nouvelEtat;
        notifier("Changement d'état vers : " + nouvelEtat.getClass().getSimpleName());
    }

    public void avancer() { this.etat.traiter(this); }

    @Override
    public String toString() { return "Opp: " + nom + " (" + montant + "€)"; }
}
