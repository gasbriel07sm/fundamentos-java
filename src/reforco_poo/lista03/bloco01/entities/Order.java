package reforco_poo.lista03.bloco01.entities;

public class Order {

    private double amount;
    private PaymentMethod paymentMethod;

    public Order(double amount,PaymentMethod  paymentMethod ) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(paymentMethod.paymentDescription()).append("\n");
        sb.append("Base: $ ").append(String.format("%.2f", amount)).append("\n");

        if (paymentMethod instanceof Pix) {
            double discount = amount * Pix.DISCOUNT;

            sb.append(String.format(
                    "PIX discount (-%.0f%%): - $ %.2f%n",
                    Pix.DISCOUNT * 100,
                    discount
            ));

        } else if (paymentMethod instanceof BankSlip) {
            sb.append("Emission fee: + $ ")
                    .append(String.format("%.2f", BankSlip.EMISSION_FEE))
                    .append("\n");

        } else if (paymentMethod instanceof CreditCard creditCard) {
            int installments = creditCard.getInstallments();
            int extraMonths = Math.max(installments - 3, 0);

            double interest = paymentMethod.calculateTotal(amount) - amount;

            sb.append(String.format(
                    "Interest (%.0f%%/month × %d extra months): + $ %.2f%n",
                    CreditCard.INTEREST_RATE * 100,
                    extraMonths,
                    interest
            ));
        }

        double total = paymentMethod.calculateTotal(amount);

        sb.append("TOTAL: $ ").append(String.format("%.2f", total));

        if (paymentMethod instanceof CreditCard creditCard) {
            sb.append(String.format("  → $ %.2f/month", total / creditCard.getInstallments()));
        }

        return sb.toString();
    }

}
