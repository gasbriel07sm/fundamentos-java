package reforco_poo.lista03.bloco01.entities;

public interface PaymentMethod {
    double calculateTotal(double amount);
    String paymentDescription();
}
