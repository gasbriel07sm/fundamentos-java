package reforco_poo.lista03.bloco06.entities;

public class PhysicalProduct extends Product {

    private Double weightKg;
    private String dimensions;

    public PhysicalProduct(String id, String name, Double price, Double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    @Override
    public String serialize() {
        return String.format("PHYSICAL|%s|%s|%.2f|%.2f|%s",
                getId(), getName(), getPrice(), weightKg, dimensions);
    }

    @Override
    public void deserialize(String line) {

    }

    @Override
    public String productType() {
        return "PHYSICAL";
    }
}
