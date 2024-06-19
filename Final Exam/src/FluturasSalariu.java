
public class FluturasSalariu extends Act {
	
    private double valoareSalariu;
    private Angajat angajat;

    public FluturasSalariu(double valoareSalariu, Angajat angajat) {
        this.valoareSalariu = valoareSalariu;
        this.angajat = angajat;
    }

    public Angajat getAngajat() {
        return angajat;
    }
}

