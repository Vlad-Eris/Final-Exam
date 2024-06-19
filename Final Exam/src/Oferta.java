
public class Oferta extends Act {
    private double valoareTotala;
    private Client client;

    public Oferta(double valoareTotala, Client client) {
        this.valoareTotala = valoareTotala;
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}


