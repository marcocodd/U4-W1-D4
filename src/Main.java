import entities.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dipendente giovanni = new DipendenteFullTime(1, 0, Dipartimento.VENDITE);
        Dipendente alfredo = new DipendentePartTime(2, 0, Dipartimento.PRODUZIONE, 25, 10);
        Dipendente antonio = new Dirigente(3, 0, Dipartimento.AMMINISTRAZIONE, 250.55);

        Dipendente[] dipendenti = {giovanni, alfredo, antonio};
        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println("Matricola:" + dipendenti[i].getMatricola());
        }
//        antonio.calculateSalary();
//        alfredo.calculateSalary();
//        System.out.println(antonio.getStipendio());
//        System.out.println(alfredo.getStipendio());

        Dipendente[] dipendentiStipendi = {giovanni, alfredo, antonio};
        double somma = 0;
        for (int i = 0; i < dipendentiStipendi.length; i++) {
            dipendentiStipendi[i].calculateSalary();
            somma = dipendentiStipendi[i].getStipendio() + somma;
        }
        System.out.println(somma);
    }
}
