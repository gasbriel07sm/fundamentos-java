package reforco_poo.lista02.desafio03;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private List<CartItem> items;
    private Promotion promotion;
    private static double totalSales = 0;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public List<CartItem> getItems() {
        return items;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public static double getTotalSales() {
        return totalSales;
    }

    public void addItem(Product p, int qty) {
        if (qty > 0 && qty <= p.getStock()) {
            items.add(new CartItem(p, qty));
        }
    }

    public double subtotal() {
        double sum = 0.0;
        for (CartItem c : items) {
            sum += c.subtotal();
        }
        return sum;
    }

    public double discount() {
        if (promotion != null && promotion.isValid()) {
            return subtotal() * promotion.getDiscountPercent() / 100.0;
        }
        return 0.0;
    }

    public double total() {
        return subtotal() - discount();
    }

    public void checkout() {
        totalSales += total();
        System.out.println("[checkout() finalizado]");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Items: ").append("\n");
        for (CartItem ci: items) {
            sb.append(ci);
        }
        sb.append("\nSubtotal: $ ").append(String.format("%.2f", subtotal()));
        if (promotion != null && promotion.isValid()) {
            sb.append("\nPromo:  TECHWEEK15 (-")
                    .append(String.format("%.0f", promotion.getDiscountPercent()))
                    .append("%) válida até ")
                    .append(promotion.getExpiresAt().format(dtf))
                    .append(" -> - $ ")
                    .append(String.format("%.2f", discount()));
        }
        sb.append("\nTotal: $ ").append(String.format("%.2f", total()));
        return sb.toString();
    }
}
