package curso_nelio_alves_poo.interfaces.Problema05.services;


public class BrazilInterestService implements TaxService {

    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
