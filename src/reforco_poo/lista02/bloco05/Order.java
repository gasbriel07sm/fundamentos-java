package reforco_poo.lista02.bloco05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Order {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private Integer number;
    private Table table;
    private LocalDateTime moment;

    private List<MenuItem> items;

    public Order(Integer number, Table table, LocalDateTime moment, List<MenuItem> items) {
        this.number = number;
        this.table = table;
        this.moment = moment;
        this.items = items;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public Double subtotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += (item.getPrice() * item.getQuantity());
        }

        return total;
    }

    public double nightFee() {
        double tax = 0;
        if (getMoment().getHour() >= 22) {
            tax = 10;
        }
        return subtotal() * 0.10;
    }

    public double total() {
        return subtotal() + nightFee();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Order #").append(getNumber())
                .append(" - Table ").append(table.getNumber())
                .append(" (").append(table.getSector()).append(")")
                .append("\n");
        sb.append("Moment: ").append(moment.format(dtf)).append("\n");
        sb.append("Items:\n");
        for (MenuItem item : items) {
            sb.append(item).append("\n");
        }
        sb.append("Subtotal: $ ").append(String.format("%.2f", subtotal()));
        sb.append("\nNight fee: $ ").append(String.format("%.2f", nightFee()));
        sb.append("\nTotal: $ ").append(String.format("%.2f", total()));

        return sb.toString();
    }
}
