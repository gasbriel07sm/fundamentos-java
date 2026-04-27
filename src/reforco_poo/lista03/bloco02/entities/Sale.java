package reforco_poo.lista03.bloco02.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sale {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private Integer id;
    private String product;
    private int quantity;
    private Double unitPrice;
    private LocalDate date;

    public Sale(Integer id, String product, int quantity, Double unitPrice, LocalDate date) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double subtotal() {
        return getUnitPrice() * getQuantity();
    }
}
