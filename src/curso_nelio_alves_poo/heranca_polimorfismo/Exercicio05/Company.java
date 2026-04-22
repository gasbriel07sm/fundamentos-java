package curso_nelio_alves_poo.heranca_polimorfismo.Exercicio05;

public class Company extends TaxPayer {

    private int numberOfEmployees;

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double tax = 0.16;

        if (getNumberOfEmployees() > 10) {
            tax = 0.14;
        }

        return getAnualIncome() * tax;
    }
}
