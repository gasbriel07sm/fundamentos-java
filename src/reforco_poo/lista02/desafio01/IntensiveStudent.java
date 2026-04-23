package reforco_poo.lista02.desafio01;

import java.time.LocalDate;

public class IntensiveStudent extends Student {

    private int hoursPerMonth;
    private double pricePerHour;

    public IntensiveStudent(String name, String email, LocalDate enrollmentDate, int hoursPerMonth, double pricePerHour) {
        super(name, email, enrollmentDate);
        this.hoursPerMonth = hoursPerMonth;
        this.pricePerHour = pricePerHour;
    }

    public int getHoursPerMonth() {
        return hoursPerMonth;
    }

    public void setHoursPerMonth(int hoursPerMonth) {
        this.hoursPerMonth = hoursPerMonth;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    @Override
    public double monthlyFee() {
        int billableHours = Math.max(hoursPerMonth, 20);
        return billableHours * pricePerHour;
    }

    @Override
    public String toString() {
        return getName() + " (Intensive " + getHoursPerMonth() + "h x R$ " + getPricePerHour() + ")"
                + " - $ " + String.format("%.2f", monthlyFee()) + "/month";
    }
}
