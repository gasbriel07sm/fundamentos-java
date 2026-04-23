package reforco_poo.lista02.bloco04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Maintenance {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate date;
    private String description;
    private Double cost;

    public Maintenance(LocalDate date, String description, Double cost) {
        this.date = date;
        this.description = description;
        this.cost = cost;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCost() {
        return cost;
    }

}
