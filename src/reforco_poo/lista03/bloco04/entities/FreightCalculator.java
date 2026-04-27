package reforco_poo.lista03.bloco04.entities;

import reforco_poo.lista03.bloco04.exceptions.FreightUnavailableException;
import reforco_poo.lista03.bloco04.exceptions.InvalidDistanceException;
import reforco_poo.lista03.bloco04.exceptions.InvalidWeightException;

public interface FreightCalculator {
    double calculate(double weightKg, double distanceKm) throws InvalidWeightException, FreightUnavailableException, InvalidDistanceException;
}
