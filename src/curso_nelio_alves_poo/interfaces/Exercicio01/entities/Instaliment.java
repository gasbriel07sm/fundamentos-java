package curso_nelio_alves_poo.interfaces.Exercicio01.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Instaliment {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate dueDate;
    private Double amount;

    public Instaliment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return dueDate.format(dtf) + " - " + String.format("%.2f", amount);
    }
}
