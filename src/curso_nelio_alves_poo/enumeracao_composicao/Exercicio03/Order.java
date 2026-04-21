package curso_nelio_alves_poo.enumeracao_composicao.Exercicio03;

import curso_nelio_alves_poo.enumeracao_composicao.Exercicio02.Comment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private OrderStatus status;

    List<OrderItem> items;
    private Client client;

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.items = new ArrayList<>();
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        double sum = 0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }

        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Order moment: ").append(moment.format(dtf)).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append(client).append("\n");
        sb.append("Order items: ").append("\n");

        for (OrderItem item : items) {
            sb.append(item.toString()).append("\n");
        }

        sb.append("Total price: ").append(String.format("%.2f", total()));

        return sb.toString();
    }
}
