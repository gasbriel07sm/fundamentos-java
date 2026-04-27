package reforco_poo.lista03.bloco04.entities;

import reforco_poo.lista03.bloco04.exceptions.FreightUnavailableException;
import reforco_poo.lista03.bloco04.exceptions.InvalidDistanceException;
import reforco_poo.lista03.bloco04.exceptions.InvalidWeightException;

public class ExpressFreight implements FreightCalculator{

    public static final double RATE_WEIGHT = 3.20;
    public static final double RATE_DISTANCE = 4.00;

    @Override
    public double calculate(double weightKg, double distanceKm) throws InvalidWeightException, InvalidDistanceException {
        if (weightKg <= 0 || weightKg > 1000) {
            throw new InvalidWeightException("Weight must be between 0 and 1000kg.");
        }
        if (distanceKm <= 0 || distanceKm > 5000) {
            throw new InvalidDistanceException("Distance must be between 0 and 5000km.");
        }
        return weightKg * RATE_WEIGHT + distanceKm * RATE_DISTANCE;
    }
}
