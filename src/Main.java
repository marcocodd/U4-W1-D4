import entities.Dipartimento;
import entities.Dipendente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dipendente giovanni = new Dipendente(1, 1000, Dipartimento.VENDITE);
        Dipendente alfredo = new Dipendente(2, 1050.50, Dipartimento.PRODUZIONE);
        Dipendente antonio = new Dipendente(3, 2150.99, Dipartimento.AMMINISTRAZIONE);

        Dipendente[] dipendenti = {giovanni, alfredo, antonio};
        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println("Matricola:" + dipendenti[i].getMatricola());

        }
    }
}
