package curso_nelio_alves_poo.heranca_polimorfismo.Exercicio03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate manufactureDate;

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        StringBuilder s = new StringBuilder();

        s.append(getName()).append(" (used), $ ")
                .append(String.format("%.2f", getPrice()))
                .append(" (Manufacture Date: ").append(manufactureDate.format(dtf)).append(")");

        return s.toString();
    }
}
