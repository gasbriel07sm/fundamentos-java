package reforco_poo.lista03.bloco01.entities;

public class BankSlip implements PaymentMethod {

    public static final double EMISSION_FEE = 3.50;

    public BankSlip() {
    }

    @Override
    public double calculateTotal(double amount) {
        return amount + EMISSION_FEE;
    }

    @Override
    public String paymentDescription() {
        return "Boleto Bancário";
    }
}
