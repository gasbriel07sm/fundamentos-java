package reforco_poo.lista02.desafio03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Promotion {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private double discountPercent;
    private LocalDate expiresAt;

    public Promotion(double discountPercent, LocalDate expiresAt) {
        this.discountPercent = discountPercent;
        this.expiresAt = expiresAt;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public LocalDate getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDate expiresAt) {
        this.expiresAt = expiresAt;
    }

    public boolean isValid() {
        return !LocalDate.now().isAfter(expiresAt);
    }
}
