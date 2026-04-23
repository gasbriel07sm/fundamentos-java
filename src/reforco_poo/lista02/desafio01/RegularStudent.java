package reforco_poo.lista02.desafio01;

import java.time.LocalDate;

public class RegularStudent extends Student {

    private double fixedMonthlyFee;

    public RegularStudent(String name, String email, LocalDate enrollmentDate, double fixedMonthlyFee) {
        super(name, email, enrollmentDate);
        this.fixedMonthlyFee = fixedMonthlyFee;
    }

    public double getFixedMonthlyFee() {
        return fixedMonthlyFee;
    }

    public void setFixedMonthlyFee(double fixedMonthlyFee) {
        this.fixedMonthlyFee = fixedMonthlyFee;
    }

    @Override
    public double monthlyFee() {
        return getFixedMonthlyFee();
    }

    @Override
    public String toString() {
        return getName() + " (Regular) " + " - $ " + String.format("%.2f", monthlyFee()) + "/month"
                + " (enrolled " + monthsEnrolled() + " months)";
    }
}
