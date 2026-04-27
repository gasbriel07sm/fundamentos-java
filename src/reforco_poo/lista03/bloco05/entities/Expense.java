package reforco_poo.lista03.bloco05.entities;

import reforco_poo.lista03.bloco05.enums.Category;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Expense {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private LocalDate date;
    private Category category;
    private String description;
    private Double amount;

    public Expense(LocalDate date, Category category, String description, Double amount) {
        this.date = date;
        this.category = category;
        this.description = description;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String toCsvLine(){
        return String.format("%s;%s;%s;%.2f",
                getDate().format(dtf), getCategory(), getDescription(), getAmount());
    }

    public static Expense fromCsvLine(String line) {
        String[] fields = line.split(";");

        if (fields.length != 4) {
            throw new NumberFormatException("Malformed CSV line: " + line);
        }

        return new Expense(
                LocalDate.parse(fields[0], dtf),
                Category.valueOf(fields[1]),
                fields[2],
                Double.parseDouble(fields[3])
        );
    }

}
