package modules.ventes;

public class EtatGagne implements IEtatOpportunite {
    public void traiter(Opportunite opt) {
        System.out.println("-> FELICITATIONS ! Opportunité gagnée. Facturation déclenchée.");
    }
}
