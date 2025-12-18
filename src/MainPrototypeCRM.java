import core.ServiceNotification;
import modules.ventes.FabriqueVentes;
import modules.ventes.Opportunite;

public class MainPrototypeCRM {
    public static void main(String[] args) {
        System.out.println("=== DEMARRAGE PROTOTYPE CRM (SEANCE 5) ===\n");

        ServiceNotification notifManager = new ServiceNotification("Manager");
        ServiceNotification notifLog = new ServiceNotification("AuditLog");

        FabriqueVentes factory = new FabriqueVentes();
        Opportunite opp = factory.creerOpportunite("Client ACME Corp", 15000.00);

        opp.attacher(notifManager);
        opp.attacher(notifLog);

        System.out.println("\n--- Cycle de Vie ---");
        opp.avancer();
        opp.avancer();

        System.out.println("\n=== FIN DU SCENARIO ===");
    }
}
