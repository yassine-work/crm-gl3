package modules.ventes;

public class EtatOuvert implements IEtatOpportunite {
    public void traiter(Opportunite opt) {
        System.out.println("-> Opportunité en cours de qualification...");
        opt.setEtat(new EtatGagne());
    }
}
