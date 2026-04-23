package reforco_poo.lista02.desafio02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Rental {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final double LATE_FEE_DAY = 5.00;
    private Media media;
    private Customer customer;
    private LocalDate rentalDate; // data de retirada
    private LocalDate dueDate; // data prevista de devolução
    private LocalDate returnDate; // data efetiva de devolução

    public Rental(Media media, Customer customer, LocalDate rentalDate, LocalDate dueDate, LocalDate returnDate) {
        this.media = media;
        this.customer = customer;
        this.rentalDate = rentalDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    // dias de aluguel
    public long rentalDays() {
        long days;
        if (returnDate == null) {
            days = ChronoUnit.DAYS.between(rentalDate, LocalDate.now());
        } else {
            days = ChronoUnit.DAYS.between(rentalDate, dueDate);
        }
        return Math.max(days, 0);
    }

    // custo base
    public double rentalCost() {
        return getMedia().dailyRate() * rentalDays(); // custo base
    }

    // calcula a multa a ser devolvida com atraso
    public double lateFee() {
        if (returnDate == null || !returnDate.isAfter(dueDate)) {
            return 0.0;
        } else {
            long days = ChronoUnit.DAYS.between(dueDate, returnDate);
            return days * LATE_FEE_DAY;
        }
    }

    // custo total
    public double totalCost() {
        return rentalCost() + lateFee();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(customer).append("\n");
        sb.append(media);
        sb.append("Rented: ").append(rentalDate.format(dtf)).append("\n");
        sb.append("Due: ").append(dueDate.format(dtf)).append("\n");
        if (returnDate != null) {
            long day = Math.max(ChronoUnit.DAYS.between(dueDate, returnDate), 0);

            sb.append("Returned: ").append(returnDate.format(dtf))
                    .append(" (+").append(day).append(" days late)")
                    .append("\n");

            sb.append("Rental cost: $ ").append(String.format("%.2f", rentalCost()))
                    .append(" (").append(rentalDays()).append(" days x R$ ")
                    .append(String.format("%.2f", getMedia().dailyRate())).append(")")
                    .append("\n");

            sb.append("Late fee: $ ").append(String.format("%.2f", lateFee()))
                    .append(" (").append(day).append(" days x R$ ")
                    .append(String.format("%.2f", LATE_FEE_DAY)).append(")")
                    .append("\n");

            sb.append("Total: $ ").append(String.format("%.2f", totalCost()));
        } else {
            sb.append("Status: NOT RETURNED YET").append("\n");
            sb.append("Rental cost so far: $ ").append(String.format("%.2f", rentalCost()));
        }
        return sb.toString();
    }
}
