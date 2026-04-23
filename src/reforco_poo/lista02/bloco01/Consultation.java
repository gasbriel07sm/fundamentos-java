package reforco_poo.lista02.bloco01;

public class Consultation extends Attendance {

    public Consultation(String petName, String tutorName, Double baseValue) {
        super(petName, tutorName, baseValue);
    }

    @Override
    public double totalValue() {
        return getBaseValue();
    }

    @Override
    public String toString() {
        return getPetName() + " (Consultation): $ " + String.format("%.2f", totalValue());
    }
}
