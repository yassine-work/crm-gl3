package modules.ventes;

import core.IFabriqueModule;

class FabriqueVentes implements IFabriqueModule {
    @Override
    public Object creerEntite(String type) {
        if (type.equalsIgnoreCase("Opportunite")) {
            return new Opportunite("Nouvelle Affaire", 0.0);
        }
        return null;
    }

    public Opportunite creerOpportunite(String client, double montant) {
        System.out.println("--- Fabrique Ventes : Création d'une opportunité pour " + client + " ---");
        return new Opportunite(client, montant);
    }
}
