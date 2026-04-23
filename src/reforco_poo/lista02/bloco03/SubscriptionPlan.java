package reforco_poo.lista02.bloco03;

public enum SubscriptionPlan {

    BASIC(19.90),
    STANDARD(34.90),
    PREMIUM(59.90);

    private final double price;

    SubscriptionPlan(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
