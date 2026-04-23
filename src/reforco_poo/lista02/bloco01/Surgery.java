package reforco_poo.lista02.bloco01;

public class Surgery extends Attendance {

    private static final double SURGERY_FEE = 150.00;
    private AnesthesiaType anesthesia;

    public Surgery(String petName, String tutorName, Double baseValue, AnesthesiaType anesthesia) {
        super(petName, tutorName, baseValue);
        this.anesthesia = anesthesia;
    }

    @Override
    public double totalValue() {
        return SURGERY_FEE + getBaseValue();
    }

    @Override
    public String toString() {
        return getPetName() + " (Surgery/" + anesthesia + "): $ " + String.format("%.2f", totalValue());
    }
}
