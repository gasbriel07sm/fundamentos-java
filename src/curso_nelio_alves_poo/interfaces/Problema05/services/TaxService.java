package curso_nelio_alves_poo.interfaces.Problema05.services;

import java.security.InvalidParameterException;

public interface TaxService {
    double getInterestRate();

    default double payment(double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("Months must be grater than zero");
        }
        return amount * Math.pow((1 + getInterestRate() / 100), months);
    };
}
