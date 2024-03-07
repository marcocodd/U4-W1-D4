package entities;

public class DipendentePartTime extends Dipendente {
    private final int oreLavoro;
    private final int tariffaOraria;

    public DipendentePartTime(int matricola, double stipendio, Dipartimento dipartimento, int oreLavoro, int tariffaOraria) {
        super(matricola, 0, dipartimento);
        this.oreLavoro = oreLavoro;
        this.tariffaOraria = tariffaOraria;
    }


    @Override
    public void calculateSalary() {
        stipendio = oreLavoro * tariffaOraria;
    }
}





