package reforco_poo.lista02.bloco03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Subscription {

    private Subscriber subscriber;
    private SubscriptionPlan plan;
    private LocalDate startDate;

    public Subscription(Subscriber subscriber, SubscriptionPlan plan, LocalDate startDate) {
        this.subscriber = subscriber;
        this.plan = plan;
        this.startDate = startDate;
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public SubscriptionPlan getPlan() {
        return plan;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public long monthsActive() {
        long months = ChronoUnit.MONTHS.between(startDate, LocalDate.now());
        return months;
    }

    public Double monthlyBill() {
        if (monthsActive() > 12) {
            return getPlan().getPrice() * 0.90;
        } else {
            return getPlan().getPrice();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(subscriber.toString());
        sb.append("\nPlan: " + plan);
        sb.append("\nActive: " + monthsActive() + " months");
        sb.append("\nLoyalty discount: " + (monthsActive() > 12 ? "YES (-10%)" : "NO"));
        sb.append("\nMonthly bill: $ " + String.format("%.2f", monthlyBill()));
        sb.append("\n");

        return sb.toString();
    }
}
