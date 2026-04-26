package reforco_poo.lista03.bloco01.entities;

public class CreditCard implements PaymentMethod {

    private int installments;
    public static final double INTEREST_RATE = 0.02;

    public CreditCard(int installments) {
        this.installments = installments;
    }

    public int getInstallments() {
        return installments;
    }

    @Override
    public double calculateTotal(double amount) {
        if (installments < 3) {
            return amount;
        } else {
            return amount * Math.pow((1 + INTEREST_RATE), installments - 3);
        }

    }

    @Override
    public String paymentDescription() {
        return "Credit Card (" + installments + "x)";
    }

}
