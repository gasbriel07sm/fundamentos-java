package reforco_poo.lista03.bloco01.entities;

public class Pix implements PaymentMethod {

    public static final double DISCOUNT = 0.05;

    public Pix() {
    }

    @Override
    public double calculateTotal(double amount) {
        return amount * (1 - DISCOUNT);
    }

    @Override
    public String paymentDescription() {
        return "PIX";
    }

}
