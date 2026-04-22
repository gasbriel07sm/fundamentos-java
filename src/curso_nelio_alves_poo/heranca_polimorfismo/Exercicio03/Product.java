package curso_nelio_alves_poo.heranca_polimorfismo.Exercicio03;

public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String priceTag() {
        StringBuilder s = new StringBuilder();
        s.append(name).append(" - $ ").append(String.format("%.2f", price));
        return s.toString();
    }
}
