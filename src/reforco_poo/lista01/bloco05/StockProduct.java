package reforco_poo.lista01.bloco05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StockProduct {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String code;
    private String name;
    private double price;
    private int quantity;
    private LocalDate expirationDate;

    public StockProduct(String code, String name, double price, int quantity, LocalDate expirationDate) {
        this.code = code;
        this.name = name;
        this.price = price >= 0 ? price : 0.0;
        this.quantity = quantity >= 0 ? quantity : 0;
        this.expirationDate = expirationDate;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void addStock(int quantity) {
        if (quantity > 0) {
            this.quantity += quantity;
        }
    }

    public void removeStock(int quantity) {
        if (quantity > 0 && quantity <= this.quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Error: insufficient stock.");
        }
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();

       sb.append("Product: " + code + " - " + name + "\n");
       sb.append("Price: $ " + String.format("%.2f", price) + "\n");
       sb.append("Expiration: " + expirationDate.format(dtf) + "\n");
       sb.append("Quantity: " + quantity + "\n");

       return sb.toString();
    }
}
