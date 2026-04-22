package curso_nelio_alves_poo.heranca_polimorfismo.Exercicio05;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double tax = 0;
        double total = 0;

        if (getAnualIncome() < 20000) {
            tax = 0.15;
        } else if (getAnualIncome() > 20000) {
            tax = 0.25;
        }

        if (getHealthExpenditures() != 0) {
            total = (getAnualIncome() * tax) - (getHealthExpenditures() * 0.5);
        } else {
            total = (getAnualIncome() * tax);
        }

        return total;
    }
}
