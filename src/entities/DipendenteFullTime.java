package entities;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(int matricola, double stipendio, Dipartimento dipartimento) {

        super(matricola, stipendio, dipartimento);
    }

    @Override
    public void calculateSalary() {
        stipendio = 1500;
    }


}
