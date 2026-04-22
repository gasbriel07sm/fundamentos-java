package curso_nelio_alves_poo.heranca_polimorfismo.Exercicio02;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return getValuePerHour() * getHours() + (1.1 * additionalCharge);
    }

    @Override
    public String toString() {
        return getName() + " - $ " + String.format("%.2f", payment()) ;
    }
}
