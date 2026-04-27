package reforco_poo.lista03.bloco06.entities;

public class DigitalProduct extends Product {

    private Double sizeMB;
    private String platform;

    public DigitalProduct(String id, String name, Double price, Double sizeMB, String platform) {
        super(id, name, price);
        this.sizeMB = sizeMB;
        this.platform = platform;
    }

    @Override
    public String serialize() {
        return String.format("DIGITAL|%s|%s|%.2f|%.2f|%s",
                getId(), getName(), getPrice(), sizeMB, platform);
    }

    @Override
    public void deserialize(String line) {

    }

    @Override
    public String productType() {
        return "DIGITAL";
    }
}
