package entities;

public class Dirigente extends Dipendente {
    private double bonusSalario;

    public Dirigente(int matricola, double stipendio, Dipartimento dipartimento, double bonusSalario) {
        super(matricola, stipendio, dipartimento);
        this.bonusSalario = bonusSalario;
    }

    @Override
    public void calculateSalary() {
        stipendio = stipendio + bonusSalario;
    }
}
