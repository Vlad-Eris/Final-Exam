import java.util.ArrayList;
import java.util.List;
import java.util.Map;

 public class Fabrica {
		 
      private List<Angajat> listaAngajati;
      private List<Client> listaClienti;
      private List<Act> listaActe;

      public Fabrica() {
          this.listaAngajati = new ArrayList<>();
          this.listaClienti = new ArrayList<>();
          this.listaActe = new ArrayList<>();
      }
      public void adaugaAngajat(Angajat angajat) {
          listaAngajati.add(angajat);
      }

      public void concediazaAngajat(Angajat angajat) {
          listaAngajati.remove(angajat);
      }

      public void adaugaClient(Client client) {
          listaClienti.add(client);
      }

      public void generareContract(Client client, double valoareTotala) {
          Oferta oferta = new Oferta(valoareTotala, client);
          listaActe.add(oferta);
      }

      public static void main(String[] args) {
          Fabrica fabrica = new Fabrica();

          Angajat angajat1 = new Angajat("Flavius", "Mihai", "Muncitor", 2001);
          fabrica.adaugaAngajat(angajat1);
	          
          Angajat angajat2 = new Angajat("Vlad", "Mihai", "Muncitor", 2005);
          fabrica.concediazaAngajat(angajat2);

          Client client1 = new Client("S.C. AscensorulOnest SRL");
          fabrica.adaugaClient(client1);

          fabrica.generareContract(client1, 3492);

      }
  }

