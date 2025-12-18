package core;

class ServiceNotification implements IObservateur {
    private String nomService;

    public ServiceNotification(String nom) {
        this.nomService = nom;
    }

    @Override
    public void mettreAJour(String message) {
        System.out.println("[NOTIF - " + nomService + "] : " + message);
    }
}
