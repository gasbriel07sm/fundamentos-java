package curso_nelio_alves_poo.interfaces.Problema05.services;

public class UsaInterestService implements TaxService{

    private double interestRate;

    public UsaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
